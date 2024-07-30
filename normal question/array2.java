
class array2 
{
    public static void main(String args[])
    {
        int a=0;
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)
            {
                a++;
                if(a<10)
                    System.out.print(a+"  ");
                else
                    System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
