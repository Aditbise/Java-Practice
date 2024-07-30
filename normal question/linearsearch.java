import java.util.*;
class linearsearch 
{
public static void main(String args[])
{
    int s,n,n1=0,n2=0,a=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    s=sc.nextInt();
    int ar[]=new int[s];
    System.out.println("Enter the element in the array :");
    for(int i=0;i<s;i++)
    {
        ar[i]=sc.nextInt();
    }
    System.out.println("Enter the number to be searched : ");
    n=sc.nextInt();
    for(int i=0;i<s;i++)
    {
        if(n==ar[i])
        {
            n1=i+1;
            n2=1;
            a=ar[i];
        }
    }
    if(n2==1)
        System.out.println("Element "+a+" in position :"+n1);
    else
        System.out.println("Element not found");
    sc.close();
}

}
