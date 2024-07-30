import java.util.*;
class metrix 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m1[][]=new int[3][3];
        int m2[][]=new int[3][3];
        int m3[][]=new int[3][3];
        System.out.println("Enter 18 numbers ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m1[i][j]=sc.nextInt();
                m2[i][j]=sc.nextInt();
            }

        }
        
        System.out.println("Given matrix are :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(m1[i][j]>9)
                System.out.print(" "+m1[i][j]);
                else
                System.out.print("  "+m1[i][j]);
            }
            System.out.print("      ");
            for(int j=0;j<3;j++)
            {
                if(m2[i][j]>9)
                System.out.print(" "+m2[i][j]);
                else
                System.out.print("  "+m2[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m3[i][j]=m2[i][j]+m1[i][j]; 
            }
        }
        System.out.println("Added matrix :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(m3[i][j]>9)
                System.out.print(" "+m3[i][j]);
                else
                System.out.print("  "+m3[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }    
}
