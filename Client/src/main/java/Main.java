import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.FateGrpc;
import proto.FateOuterClass;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static boolean validateDate(String date)
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

    public static void main(String[] args)
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress
                ("localhost", 8999).usePlaintext().build();

        FateGrpc.FateStub personStub = FateGrpc.newStub(channel);

        System.out.println("1) Verify Zodiac");
        System.out.println("0) Exit");

        int option = -1;
        while (option != 0)
        {
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.print("Introduceti o optiune: ");
            Scanner sc=new Scanner(System.in);
            option=sc.nextInt();


            switch(option)
            {
                case 1:
                    Scanner read = new Scanner(System.in);
                    System.out.print("Introduceti Data: ");
                    String date = read.nextLine();

                    if(!validateDate(date))
                    {
                        System.out.println("Nu e buna data!");
                        break;
                    }

                    personStub.returnFate(
                            FateOuterClass.DateRequest.newBuilder().setDate(date).build(),
                            new StreamObserver<FateOuterClass.Reply>()
                            {
                                @Override
                                public void onNext(FateOuterClass.Reply reply)
                                {
                                    System.out.println(reply);
                                }

                                @Override
                                public void onError(Throwable throwable)
                                {
                                    System.out.println("Error: " + throwable.getMessage());
                                }

                                @Override
                                public void onCompleted()
                                {

                                }
                            }
                    );
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nu stiu comanda asta!");
                    break;
            }

        }

        channel.shutdown();
    }
}
