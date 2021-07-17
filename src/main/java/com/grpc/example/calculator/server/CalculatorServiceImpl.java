package com.grpc.example.calculator.server;

import com.proto.calculator.AverageRequest;
import com.proto.calculator.AverageResponse;
import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.FindMaximumRequest;
import com.proto.calculator.FindMaximumResponse;
import com.proto.calculator.PrimeNumberRequest;
import com.proto.calculator.PrimeNumberResponse;
import com.proto.calculator.Sum;
import com.proto.calculator.SumRequest;
import com.proto.calculator.SumResponse;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {

        Sum sum = request.getSum();

        SumResponse response = SumResponse.newBuilder()
                .setResult(sum.getFirstNumber() + sum.getSecondNumber())
                .build();

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }

    @Override
    public void primeNumber(PrimeNumberRequest request, StreamObserver<PrimeNumberResponse> responseObserver) {

        int k = 2;

        int number = request.getNumber();

        while (number > 1) {

            if (number % k == 0){
                responseObserver.onNext(PrimeNumberResponse.newBuilder()
                        .setResult(k)
                        .build());

                number = number / k;
            } else {
                k++;
            }
        }
        responseObserver.onCompleted();

    }

    @Override
    public StreamObserver<AverageRequest> average(StreamObserver<AverageResponse> responseObserver) {

        return new StreamObserver<AverageRequest>() {

            Long sum = 0L;
            Integer count = 0;

            @Override
            public void onNext(AverageRequest value) {
                sum += value.getNumber();
                count++;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        AverageResponse.newBuilder()
                                .setMean((double) sum / count)
                                .build()
                );

                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<FindMaximumRequest> findMaximum(StreamObserver<FindMaximumResponse> responseObserver) {
        return new StreamObserver<FindMaximumRequest>() {

            Integer result;
            boolean first = true;

            @Override
            public void onNext(FindMaximumRequest value) {
                if (first) {
                    result = value.getNumber();
                    responseObserver.onNext(FindMaximumResponse.newBuilder()
                            .setMaximum(result)
                            .build());
                    first = false;
                } else {
                    result = result.compareTo(value.getNumber()) > 0 ? result : value.getNumber();
                    responseObserver.onNext(FindMaximumResponse.newBuilder()
                            .setMaximum(result)
                            .build());
                }
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
