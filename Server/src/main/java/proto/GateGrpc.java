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
    comments = "Source: gate.proto")
public final class GateGrpc {

  private GateGrpc() {}

  public static final String SERVICE_NAME = "Gate";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.GateOuterClass.DateRequest,
      proto.GateOuterClass.Empty> getReturnFateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "returnFate",
      requestType = proto.GateOuterClass.DateRequest.class,
      responseType = proto.GateOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.GateOuterClass.DateRequest,
      proto.GateOuterClass.Empty> getReturnFateMethod() {
    io.grpc.MethodDescriptor<proto.GateOuterClass.DateRequest, proto.GateOuterClass.Empty> getReturnFateMethod;
    if ((getReturnFateMethod = GateGrpc.getReturnFateMethod) == null) {
      synchronized (GateGrpc.class) {
        if ((getReturnFateMethod = GateGrpc.getReturnFateMethod) == null) {
          GateGrpc.getReturnFateMethod = getReturnFateMethod = 
              io.grpc.MethodDescriptor.<proto.GateOuterClass.DateRequest, proto.GateOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Gate", "returnFate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GateOuterClass.DateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.GateOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new GateMethodDescriptorSupplier("returnFate"))
                  .build();
          }
        }
     }
     return getReturnFateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GateStub newStub(io.grpc.Channel channel) {
    return new GateStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GateBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GateBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GateFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GateFutureStub(channel);
  }

  /**
   */
  public static abstract class GateImplBase implements io.grpc.BindableService {

    /**
     */
    public void returnFate(proto.GateOuterClass.DateRequest request,
        io.grpc.stub.StreamObserver<proto.GateOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getReturnFateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReturnFateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.GateOuterClass.DateRequest,
                proto.GateOuterClass.Empty>(
                  this, METHODID_RETURN_FATE)))
          .build();
    }
  }

  /**
   */
  public static final class GateStub extends io.grpc.stub.AbstractStub<GateStub> {
    private GateStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GateStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GateStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GateStub(channel, callOptions);
    }

    /**
     */
    public void returnFate(proto.GateOuterClass.DateRequest request,
        io.grpc.stub.StreamObserver<proto.GateOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReturnFateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GateBlockingStub extends io.grpc.stub.AbstractStub<GateBlockingStub> {
    private GateBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GateBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GateBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GateBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.GateOuterClass.Empty returnFate(proto.GateOuterClass.DateRequest request) {
      return blockingUnaryCall(
          getChannel(), getReturnFateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GateFutureStub extends io.grpc.stub.AbstractStub<GateFutureStub> {
    private GateFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GateFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GateFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GateFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.GateOuterClass.Empty> returnFate(
        proto.GateOuterClass.DateRequest request) {
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
    private final GateImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GateImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RETURN_FATE:
          serviceImpl.returnFate((proto.GateOuterClass.DateRequest) request,
              (io.grpc.stub.StreamObserver<proto.GateOuterClass.Empty>) responseObserver);
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

  private static abstract class GateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GateBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.GateOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Gate");
    }
  }

  private static final class GateFileDescriptorSupplier
      extends GateBaseDescriptorSupplier {
    GateFileDescriptorSupplier() {}
  }

  private static final class GateMethodDescriptorSupplier
      extends GateBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GateMethodDescriptorSupplier(String methodName) {
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
      synchronized (GateGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GateFileDescriptorSupplier())
              .addMethod(getReturnFateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
