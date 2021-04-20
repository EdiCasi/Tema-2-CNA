import io.grpc.stub.StreamObserver;
import proto.GateGrpc;
import proto.GateOuterClass;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GateImpl extends GateGrpc.GateImplBase
{
    @Override
    public void returnFate(GateOuterClass.DateRequest request, StreamObserver<GateOuterClass.Empty> responseObserver)
    {
        String input = request.getDate();
        if (validateDate(input) == false)
            responseObserver.onError(new Throwable("Input nu e bun"));

        Date date = new Date(input);
    }

    public boolean validateDate(String date)
    {
        Pattern datePattern = Pattern.compile("[0-3]?[0-9]/[0-1]?[0-9]/[1-2][0-9][0-9][0-9]");

        Matcher matcher = datePattern.matcher(date);

        if (date.length() > 10)
            return false;

        if (!Character.isDigit(date.charAt(0)))
            return false;

        if (!Character.isDigit(date.charAt(date.length() - 1)))
            return false;

        if (!matcher.find())
            return false;

        return true;
    }

}
