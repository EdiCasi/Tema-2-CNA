package proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: fate.proto")
public final class FateGrpc {

  private FateGrpc() {}

  public static final String SERVICE_NAME = "Fate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.FateOuterClass.DateRequest,
      proto.FateOuterClass.Reply> getReturnFateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "returnFate",
      requestType = proto.FateOuterClass.DateRequest.class,
      responseType = proto.FateOuterClass.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.FateOuterClass.DateRequest,
      proto.FateOuterClass.Reply> getReturnFateMethod() {
    io.grpc.MethodDescriptor<proto.FateOuterClass.DateRequest, proto.FateOuterClass.Reply> getReturnFateMethod;
    if ((getReturnFateMethod = FateGrpc.getReturnFateMethod) == null) {
      synchronized (FateGrpc.class) {
        if ((getReturnFateMethod = FateGrpc.getReturnFateMethod) == null) {
          FateGrpc.getReturnFateMethod = getReturnFateMethod = 
              io.grpc.MethodDescriptor.<proto.FateOuterClass.DateRequest, proto.FateOuterClass.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Fate", "returnFate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.FateOuterClass.DateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.FateOuterClass.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new FateMethodDescriptorSupplier("returnFate"))
                  .build();
          }
        }
     }
     return getReturnFateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FateStub newStub(io.grpc.Channel channel) {
    return new FateStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FateBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FateFutureStub(channel);
  }

  /**
   */
  public static abstract class FateImplBase implements io.grpc.BindableService {

    /**
     */
    public void returnFate(proto.FateOuterClass.DateRequest request,
        io.grpc.stub.StreamObserver<proto.FateOuterClass.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getReturnFateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReturnFateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.FateOuterClass.DateRequest,
                proto.FateOuterClass.Reply>(
                  this, METHODID_RETURN_FATE)))
          .build();
    }
  }

  /**
   */
  public static final class FateStub extends io.grpc.stub.AbstractStub<FateStub> {
    private FateStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FateStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FateStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FateStub(channel, callOptions);
    }

    /**
     */
    public void returnFate(proto.FateOuterClass.DateRequest request,
        io.grpc.stub.StreamObserver<proto.FateOuterClass.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReturnFateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FateBlockingStub extends io.grpc.stub.AbstractStub<FateBlockingStub> {
    private FateBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FateBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FateBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FateBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.FateOuterClass.Reply returnFate(proto.FateOuterClass.DateRequest request) {
      return blockingUnaryCall(
          getChannel(), getReturnFateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FateFutureStub extends io.grpc.stub.AbstractStub<FateFutureStub> {
    private FateFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FateFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FateFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FateFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.FateOuterClass.Reply> returnFate(
        proto.FateOuterClass.DateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReturnFateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RETURN_FATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETURN_FATE:
          serviceImpl.returnFate((proto.FateOuterClass.DateRequest) request,
              (io.grpc.stub.StreamObserver<proto.FateOuterClass.Reply>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.FateOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Fate");
    }
  }

  private static final class FateFileDescriptorSupplier
      extends FateBaseDescriptorSupplier {
    FateFileDescriptorSupplier() {}
  }

  private static final class FateMethodDescriptorSupplier
      extends FateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FateMethodDescriptorSupplier(String methodName) {
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
      synchronized (FateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FateFileDescriptorSupplier())
              .addMethod(getReturnFateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
