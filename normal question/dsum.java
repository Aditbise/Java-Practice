import java.util.*;
class dsum 
{
    public static void main(String args[])
    {
        int s1=0,s2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and bredth of the matrix");
        int l=sc.nextInt();
        int b=sc.nextInt();
        if(l==b)
        {
            int m[][]=new int[l][b];
            System.out.println("Enter "+(l*b)+" element in matrix");
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<b;j++)
                {
                    m[i][j]=sc.nextInt();
                    if(i==j)
                    s1=s1+m[i][j];
                    else if((i+j)==b)
                    s2=s2+m[i][j];
                } 
            }
            System.out.println("Matrix :");
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<b;j++)
                {
                    if(m[i][j]>10)
                    System.out.print(" "+m[i][j]);
                    else
                    System.out.print("  "+m[i][j]);
                }
                System.out.println();
            }
            System.out.println("Sum of right matrix :\n"+s1);
            System.out.println("Sum of left matrix :\n"+s2);
        }
        else
        {

            System.out.println("Not Possible");
        }
        sc.close();
    }
    
}
