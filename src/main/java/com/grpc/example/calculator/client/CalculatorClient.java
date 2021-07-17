package com.grpc.example.calculator.client;

import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {

    public static void main(String[] args) {
        System.out.println("Start a calculator client");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50052)
                .usePlaintext()
                .build();

        //createSumClientCalculator(channel);

        //createPrimeNumberDecompositionClientCalculator(channel);

        //createAverageClientCalculator(channel);

        createFindMaximumClientCalculator(channel);

    }

    private static void createSumClientCalculator(ManagedChannel channel) {

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        Sum sum = Sum.newBuilder()
                .setFirstNumber(3)
                .setSecondNumber(10)
                .build();

        SumRequest request = SumRequest.newBuilder()
                .setSum(sum)
                .build();

        SumResponse response = stub.sum(request);

        System.out.println("The response is: " + response.getResult());

        System.out.println("Down channel");
        channel.shutdown();
    }

    private static void createPrimeNumberDecompositionClientCalculator(ManagedChannel channel) {

        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        PrimeNumberRequest request = PrimeNumberRequest.newBuilder()
                .setNumber(567890879)
                .build();

        List<Integer> list = new ArrayList<>(Collections.emptyList());

        stub.primeNumber(request)
            .forEachRemaining( primeNumberResponse -> {
                list.add(primeNumberResponse.getResult());
            });

        System.out.println("The list of prime number is: " + list);

        System.out.println("Down channel");
        channel.shutdown();
    }

    private static void createAverageClientCalculator(ManagedChannel channel) {

        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AverageRequest> requestObserver = stub.average(new StreamObserver<AverageResponse>() {
            @Override
            public void onNext(AverageResponse value) {
                System.out.println("Receive a response from the server");
                System.out.println(value.getMean());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Sever has completed sending us something");
                latch.countDown();
            }
        });

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(8)
                .build());

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(10)
                .build());

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(5)
                .build());

        requestObserver.onNext(AverageRequest.newBuilder()
                .setNumber(3)
                .build());

        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void createFindMaximumClientCalculator (ManagedChannel channel) {
        CalculatorServiceGrpc.CalculatorServiceStub stub = CalculatorServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FindMaximumRequest> requestObserver = stub.findMaximum(new StreamObserver<FindMaximumResponse>() {
            @Override
            public void onNext(FindMaximumResponse value) {
                System.out.println("Response from server: " + value.getMaximum());
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

        Arrays.asList(-99, -12, -20, 5, 0, 120, 220, 137, 129, 830).forEach(
                number -> {
                    System.out.println("Sending number: " + number);
                    requestObserver.onNext(FindMaximumRequest.newBuilder()
                            .setNumber(number)
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
