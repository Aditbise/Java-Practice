
class array3
{
    public static void main(String args[])
    {
        for(int i=4,j=0;i>=0;i--,j++)
        {   
            for(int k=i;k>0;k--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=j;k++)
            {
                System.out.print("* ");
            }
            for(int k=0;k<=j;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0,j=5;i<=4;i++,j--)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print("  ");
            }
            for(int k=j;k>0;k--)
            {
                System.out.print("* ");
            }
            for(int k=j;k>0;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
