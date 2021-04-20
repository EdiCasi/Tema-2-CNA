import io.grpc.stub.StreamObserver;
import proto.FateGrpc;
import proto.FateOuterClass;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FateImpl extends FateGrpc.FateImplBase
{
    private ArrayList<Fate> fates;

    public FateImpl()
    {
        fates = new ArrayList<>();
        readFatesFromFile("src/main/resources/fates.txt");
    }

    @Override
    public void returnFate(FateOuterClass.DateRequest request, StreamObserver<FateOuterClass.Reply> responseObserver)
    {
        FateOuterClass.Reply.Builder reply = FateOuterClass.Reply.newBuilder();

        String input = request.getDate();
//        if (validateDate(input) == false)
//            responseObserver.onError(new Throwable("Input nu e bun"));

        String fateName = getFateFromDate(new Date(input));
        reply.setFate(fateName);

        responseObserver.onNext(reply.build());
        responseObserver.onCompleted();
    }



    public void readFatesFromFile(String fileName)
    {
        File file = new File(fileName);
        Scanner sc;
        try
        {
            sc = new Scanner(file);
        } catch (FileNotFoundException e)
        {
            sc = new Scanner(System.in);
            e.printStackTrace();
        }

        while (sc.hasNext())
        {
            fates.add(new Fate(new Date(sc.next()), new Date(sc.next()), sc.next()));
        }
    }

    public String getFateFromDate(Date date)
    {
        for (Fate fate : fates)
        {
            if (fate.dateIsThisFate(date))
                return fate.getName();
        }
        return "No fate for this date";
    }

}
