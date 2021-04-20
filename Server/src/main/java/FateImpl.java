import io.grpc.stub.StreamObserver;
import proto.FateGrpc;
import proto.FateOuterClass;

public class FateImpl extends FateGrpc.FateImplBase
{
    @Override
    public void returnFate(FateOuterClass.DateRequest request, StreamObserver<FateOuterClass.Reply> responseObserver)
    {

    }
}
