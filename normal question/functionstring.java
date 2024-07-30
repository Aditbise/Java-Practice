import java.util.*;
class functionstring  
{
    public static void main(String args[])
    {
        String s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 string respectively : ");
        s1=sc.nextLine();
        s2=sc.nextLine();
        s1=s1.trim();
        s2=s2.trim();
        s3=s1.concat(s2);
        if((s1.toUpperCase()).equals(s2.toUpperCase()))
        {
            s1=s1.toUpperCase();
            s2=s2.toUpperCase();
            System.out.println("Given String "+s1+" "+s2+" are Equal");
            System.out.println("Given String with replacement : "+s1.replace('A','B')+" "+s2.replace('A','B'));
        }
        else 
        {
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
            System.out.println("Given string in lower case are : "+s1+" "+s2);
            System.out.println("Concatinated string is : "+s3);
        }
        sc.close();
    }
}
