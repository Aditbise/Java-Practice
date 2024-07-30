import java.util.*;
class calculator 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c,n1,n2,r;
        do
        {
            System.out.println("Enter \n1.+\n2.-\n3./\n4.*\n5.%\n6.Exit");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                        System.out.println("Enter 2 numbers");
                        n1=sc.nextInt();
                        n2=sc.nextInt();
                        r=n1+n2;
                        System.out.println("Ans."+r);
                        break;
                case 2:
                        System.out.println("Enter 2 numbers");
                        n1=sc.nextInt();
                        n2=sc.nextInt();
                        r=n1-n2;
                        System.out.println("Ans."+r);
                        break;
                case 3:
                        System.out.println("Enter 2 numbers");
                        n1=sc.nextInt();
                        n2=sc.nextInt();
                        r=n1/n2;
                        System.out.println("Ans."+r);
                        break;
                case 4:
                        System.out.println("Enter 2 numbers");
                        n1=sc.nextInt();
                        n2=sc.nextInt();
                        r=n1*n2;
                        System.out.println("Ans."+r);
                        break;
                case 5:
                        System.out.println("Enter 2 numbers");
                        n1=sc.nextInt();
                        n2=sc.nextInt();
                        r=n1%n2;
                        System.out.println("Ans."+r);
                        break;
                case 6:
                        System.out.println("Exiting...");
                        break;
                default:
                        System.out.println("Wrong choice");
            }
        }while(c!=6);
        sc.close();
    }
    
}
