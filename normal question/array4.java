import java.util.*;
class array4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[][]=new int[4][];
        ar[0]=new int[3];
        ar[1]=new int[2];
        ar[2]=new int[4];
        ar[3]=new int[6];
        System.out.println("Enter elements in array : ");
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                ar[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}