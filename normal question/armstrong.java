import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        int n,n1,r,s=0,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n=sc.nextInt();
        n1=n;
        while(n1>0)
        {
            r=n1%10;
            c=r*r*r;
            s=s+c;
            n1=n1/10;
        }
        if(s==n)
            System.out.println(n+" is  a amstrong number");
        else
            System.out.println(n+" is not a amstrong number"); 
        sc.close();   
    }
}