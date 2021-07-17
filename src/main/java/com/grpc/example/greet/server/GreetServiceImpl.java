package com.grpc.example.greet.server;

import com.proto.greet.GreetEveryoneRequest;
import com.proto.greet.GreetEveryoneResponse;
import com.proto.greet.GreetManyTimeRequest;
import com.proto.greet.GreetManyTimesResponse;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.GreetServiceGrpc;
import com.proto.greet.Greeting;
import com.proto.greet.LongGreetRequest;
import com.proto.greet.LongGreetResponse;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {

    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {

        // Extract the fields we need
        Greeting greeting = request.getGreeting();

        String first_name = greeting.getFirstName();
        String last_name = greeting.getLastName();

        // Create response
        String result = "Hello " + first_name + " " + last_name;

        GreetResponse response = GreetResponse.newBuilder()
                .setResult(result)
                .build();

        // Send Response
        responseObserver.onNext(response);

        //Complete RPC call
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetManyTimeRequest request, StreamObserver<GreetManyTimesResponse> responseObserver) {

        String firstName = request.getGreeting().getFirstName();

        try {
            for (int i = 0; i < 10; i++) {
                String result = "Hello " + firstName + ", response number: " + i;

                GreetManyTimesResponse response = GreetManyTimesResponse.newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {

        return new StreamObserver<LongGreetRequest>() {

            String result = "";

            @Override
            public void onNext(LongGreetRequest value) {
                //Client sends a message
                result += ". Hello " + value.getGreeting().getFirstName() + "! ";
            }

            @Override
            public void onError(Throwable t) {
                //Client sends an error
            }

            @Override
            public void onCompleted() {
                //Client is done
                responseObserver.onNext(
                        LongGreetResponse.newBuilder()
                        .setResult(result)
                        .build()
                );
                //This is when we'll want to return a response (responseObserver)
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<GreetEveryoneRequest> greetEveryone(StreamObserver<GreetEveryoneResponse> responseObserver) {

        return new StreamObserver<GreetEveryoneRequest>() {
            @Override
            public void onNext(GreetEveryoneRequest value) {
                String response = "Hello " + value.getGreeting().getFirstName();
                GreetEveryoneResponse greetEveryoneResponse = GreetEveryoneResponse.newBuilder()
                        .setResult(response)
                        .build();

                responseObserver.onNext(greetEveryoneResponse);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

    }
}
