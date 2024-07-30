import java.util.*;
public class Main {
    public static void main(String arga[])
    {
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a whole number to divdide: ");
        int x=sc.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int y=sc.nextInt();

        int z=x/y;
        System.out.println("result: "+z+" ");
        }
        catch(ArithmeticException e)
        {
            System.out.println("You cant devide by 0 idiot!!");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter a whole number omfg!!");
        }
        catch(Exception e)
        {
            System.out.println("Something want wrong idk...");
        }
        finally
        {
            System.out.println("This will always print ");
            sc.close();
        }
    }
    
}
