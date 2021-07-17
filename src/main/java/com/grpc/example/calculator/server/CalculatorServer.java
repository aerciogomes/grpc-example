package com.grpc.example.calculator.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class CalculatorServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Teste calculator");

        Server server = ServerBuilder.forPort(50052)
                .addService(new CalculatorServiceImpl())
                .build();

        server.start();

        Runtime.getRuntime().addShutdownHook( new Thread( () -> {
            System.out.println("Receive a end thread");
            server.shutdown();
            System.out.println("Thread stopped");
        } ));

        server.awaitTermination();
    }
}
