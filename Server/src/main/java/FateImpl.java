import io.grpc.stub.StreamObserver;
import proto.FateGrpc;
import proto.FateOuterClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FateImpl extends FateGrpc.FateImplBase
{
    private ArrayList<Fate> fates = new ArrayList<>();



    @Override
    public void returnFate(FateOuterClass.DateRequest request, StreamObserver<FateOuterClass.Reply> responseObserver)
    {
        String input = request.getDate();
        if (validateDate(input) == false)
            responseObserver.onError(new Throwable("Input nu e bun"));

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

    public void readFatesFromFile(String fileName)
    {
        File file = new File(fileName);
        Scanner sc;
        try
        {
            sc = new Scanner(file);
        } catch (FileNotFoundException e)
        {
            sc=new Scanner(System.in);
            e.printStackTrace();
        }

        while(sc.hasNext())
        {
            fates.add(new Fate(new Date(sc.next()),new Date(sc.next()),sc.next()));
        }
        System.out.println(fates);
    }

}
