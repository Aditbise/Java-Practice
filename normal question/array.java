import java.util.*;
class array
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        n=sc.nextInt();
        int ar[]= new int[n];
        System.out.println("Enter "+n+" elements in array");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Array Element are :");
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");
        }
        sc.close();
    }
}