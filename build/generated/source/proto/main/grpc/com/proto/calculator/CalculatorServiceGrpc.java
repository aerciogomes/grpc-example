package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: calculator/calculator.proto")
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.SumRequest,
      com.proto.calculator.SumResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.proto.calculator.SumRequest.class,
      responseType = com.proto.calculator.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.SumRequest,
      com.proto.calculator.SumResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.SumRequest, com.proto.calculator.SumResponse> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.SumRequest, com.proto.calculator.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberRequest,
      com.proto.calculator.PrimeNumberResponse> getPrimeNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PrimeNumber",
      requestType = com.proto.calculator.PrimeNumberRequest.class,
      responseType = com.proto.calculator.PrimeNumberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberRequest,
      com.proto.calculator.PrimeNumberResponse> getPrimeNumberMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberRequest, com.proto.calculator.PrimeNumberResponse> getPrimeNumberMethod;
    if ((getPrimeNumberMethod = CalculatorServiceGrpc.getPrimeNumberMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPrimeNumberMethod = CalculatorServiceGrpc.getPrimeNumberMethod) == null) {
          CalculatorServiceGrpc.getPrimeNumberMethod = getPrimeNumberMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.PrimeNumberRequest, com.proto.calculator.PrimeNumberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PrimeNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeNumberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("PrimeNumber"))
              .build();
        }
      }
    }
    return getPrimeNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.AverageRequest,
      com.proto.calculator.AverageResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Average",
      requestType = com.proto.calculator.AverageRequest.class,
      responseType = com.proto.calculator.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.AverageRequest,
      com.proto.calculator.AverageResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.AverageRequest, com.proto.calculator.AverageResponse> getAverageMethod;
    if ((getAverageMethod = CalculatorServiceGrpc.getAverageMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getAverageMethod = CalculatorServiceGrpc.getAverageMethod) == null) {
          CalculatorServiceGrpc.getAverageMethod = getAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.AverageRequest, com.proto.calculator.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.AverageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.AverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Average"))
              .build();
        }
      }
    }
    return getAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.FindMaximumRequest,
      com.proto.calculator.FindMaximumResponse> getFindMaximumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindMaximum",
      requestType = com.proto.calculator.FindMaximumRequest.class,
      responseType = com.proto.calculator.FindMaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.FindMaximumRequest,
      com.proto.calculator.FindMaximumResponse> getFindMaximumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.FindMaximumRequest, com.proto.calculator.FindMaximumResponse> getFindMaximumMethod;
    if ((getFindMaximumMethod = CalculatorServiceGrpc.getFindMaximumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getFindMaximumMethod = CalculatorServiceGrpc.getFindMaximumMethod) == null) {
          CalculatorServiceGrpc.getFindMaximumMethod = getFindMaximumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.FindMaximumRequest, com.proto.calculator.FindMaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindMaximum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.FindMaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.FindMaximumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("FindMaximum"))
              .build();
        }
      }
    }
    return getFindMaximumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.proto.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void primeNumber(com.proto.calculator.PrimeNumberRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeNumberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrimeNumberMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.AverageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getFindMaximumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.SumRequest,
                com.proto.calculator.SumResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getPrimeNumberMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calculator.PrimeNumberRequest,
                com.proto.calculator.PrimeNumberResponse>(
                  this, METHODID_PRIME_NUMBER)))
          .addMethod(
            getAverageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calculator.AverageRequest,
                com.proto.calculator.AverageResponse>(
                  this, METHODID_AVERAGE)))
          .addMethod(
            getFindMaximumMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.calculator.FindMaximumRequest,
                com.proto.calculator.FindMaximumResponse>(
                  this, METHODID_FIND_MAXIMUM)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primeNumber(com.proto.calculator.PrimeNumberRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.PrimeNumberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPrimeNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AverageRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.AverageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.SumResponse sum(com.proto.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.PrimeNumberResponse> primeNumber(
        com.proto.calculator.PrimeNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPrimeNumberMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.SumResponse> sum(
        com.proto.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_PRIME_NUMBER = 1;
  private static final int METHODID_AVERAGE = 2;
  private static final int METHODID_FIND_MAXIMUM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.calculator.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.SumResponse>) responseObserver);
          break;
        case METHODID_PRIME_NUMBER:
          serviceImpl.primeNumber((com.proto.calculator.PrimeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.PrimeNumberResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<com.proto.calculator.AverageResponse>) responseObserver);
        case METHODID_FIND_MAXIMUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximum(
              (io.grpc.stub.StreamObserver<com.proto.calculator.FindMaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getPrimeNumberMethod())
              .addMethod(getAverageMethod())
              .addMethod(getFindMaximumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
