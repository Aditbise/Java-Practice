package generics.genericdatatypes;

public class Main {

    public static void main(String[] args) {

        Integer iar[]={1,2,3,4,5,6};
        Double dar[]={0.1,0.2,0.3,0.4,0.5,0.6};
        Character car[]={'h','e','l','l','o'};
        String sar[]={"B","Y","E"};

        displayarray(iar);
        displayarray(dar);
        displayarray(car);
        displayarray(sar);

    }
    public static <Thing> void displayarray(Thing ar[])
    {
        for(Thing x : ar)
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
