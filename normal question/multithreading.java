import java.util.*;
import java.lang.*;
class MyRunnable implements Runnable
{
    private String name;
    public MyRunnable(String name)
    {
        this.name=name;
    }
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(name+":"+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}

   