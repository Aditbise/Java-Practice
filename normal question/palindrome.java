import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        int n,n1,r,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number :");
        n=sc.nextInt();
        n1=n;
        while(n1>0)
        {
            r=n1%10;
            s=(s*10)+r;
            n1=n1/10;
        }
        if(s==n)
            System.out.println(n+" is  a palindrome number");
        else
            System.out.println(n+" is not a palindrome number");  
            sc.close();  
    }
}
// wap to compute power of 2n using forloop