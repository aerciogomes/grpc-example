package com.grpc.example.greet.client;

import com.proto.greet.GreetEveryoneRequest;
import com.proto.greet.GreetEveryoneResponse;
import com.proto.greet.GreetManyTimeRequest;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import com.proto.greet.LongGreetRequest;
import com.proto.greet.LongGreetResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class GrettingClient {

    public static void main(String[] args) {
        System.out.println("Hello I'm a gRPC client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        //Unary
        //createGreetClientUnary(channel);

        //Server Streaming
        //createGreetWithServerStreaming(channel);

        //Client Streaming
        //createGreetWithClientStreaming(channel);

        //BiDi streaming
        createGreetWithBiDiStreaming(channel);

        //Do something
        System.out.println("Shutdown channel");
        channel.shutdown();
    }

    private static void createGreetClientUnary(ManagedChannel channel){

        System.out.println("Creating Stub");

        // Create a greet service client (blocking - synchronous)
        GreetServiceGrpc.GreetServiceBlockingStub stub = GreetServiceGrpc.newBlockingStub(channel);

        System.out.println("Unary");

        // Create a protocol buffer greeting message
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("Aércio")
                .setLastName("Gomes")
                .build();

        // do the same for GreetRequest
        GreetRequest request = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();

        // Call the RPC and get back a GreetResponse (protocol buffers)
        GreetResponse response = stub.greet(request);

        System.out.println(response.getResult());
    }

    private static void createGreetWithServerStreaming(ManagedChannel channel) {

        System.out.println("Creating Stub");

        // Create a greet service client (blocking - synchronous)
        GreetServiceGrpc.GreetServiceBlockingStub stub = GreetServiceGrpc.newBlockingStub(channel);

        System.out.println("Server Streaming");

        // Prepare Request
        GreetManyTimeRequest greetManyTimeRequest = GreetManyTimeRequest.newBuilder()
                .setGreeting(Greeting.newBuilder().setFirstName("Aércio"))
                .build();

        // we stream the response (in a blocking manner
        stub.greetManyTimes(greetManyTimeRequest)
                .forEachRemaining(greetManyTimesResponse -> {
                    System.out.println(greetManyTimesResponse.getResult());
                });
    }

    private static void createGreetWithClientStreaming(ManagedChannel channel) {
        System.out.println("Client Streaming");

        // Create an async client
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<LongGreetRequest> requestObserver = asyncClient.longGreet(new StreamObserver<LongGreetResponse>() {
            @Override
            public void onNext(LongGreetResponse value) {
                // we get response from the server
                System.out.println("Receive a response from the server");
                System.out.println(value.getResult());
                // on next will be called only once
            }

            @Override
            public void onError(Throwable t) {
                // we get error from the server
            }

            @Override
            public void onCompleted() {
                // the server is done sending data
                System.out.println("Sever has completed sending us something");
                latch.countDown();
                // will be called after onNext
            }
        });

        // Streaming messages
        System.out.println("Sending message 1");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setFirstName("Aércio")
                        .build())
                .build());

        System.out.println("Sending message 2");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setFirstName("Gomes")
                        .build())
                .build());

        System.out.println("Sending message 3");
        requestObserver.onNext(LongGreetRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setFirstName("Test")
                        .build())
                .build());

        // we call the server that the client is done sending data
        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void createGreetWithBiDiStreaming(ManagedChannel channel) {

        System.out.println("BiDi Streaming");

        // Create an async client
        GreetServiceGrpc.GreetServiceStub asyncClient = GreetServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<GreetEveryoneRequest> requestObserver = asyncClient.greetEveryone(new StreamObserver<GreetEveryoneResponse>() {
            @Override
            public void onNext(GreetEveryoneResponse value) {
                System.out.println("Response from server: " + value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
                latch.countDown();
            }
        });

        Arrays.asList("Aércio", "Gomes", "Alex", "Lucas").forEach(
                name -> {
                    System.out.println("Sending name: "+name);
                    requestObserver.onNext(GreetEveryoneRequest.newBuilder()
                            .setGreeting(Greeting.newBuilder().setFirstName(name).build())
                            .build());

                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        requestObserver.onCompleted();

        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
