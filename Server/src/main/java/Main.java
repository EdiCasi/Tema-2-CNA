public class Main
{
    public static void main(String[] args)
    {
//        Date date = new Date("1/2/0000");
//        date.setYear(2000-1900);
//        System.out.println(date.getYear()+1900);

        FateImpl fate = new FateImpl();

        fate.readFatesFromFile("fates.txt");
    }
}
