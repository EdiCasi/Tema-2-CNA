import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import proto.FateGrpc;
import proto.FateOuterClass;

import java.util.Scanner;

public class Main
{
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
