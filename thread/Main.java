import java.util.*;
import java.lang.InterruptedException;
public class Main
{
    public static void main(String args[]) throws InterruptedException
    {
        // System.out.println(Thread.activeCount());//to find active threads


        // Thread.currentThread().setName("hibiki futa");//to name a thread 
        // System.out.println(Thread.currentThread().getName());//to print name of current thread 


        // Thread.currentThread().setPriority(1); //to set the priority of the thread
        // System.out.println(Thread.currentThread().getPriority()); //to find the priority of the thread
        
        
        // System.out.println(Thread.currentThread().isAlive()); //to find the priority of the thread


        for(int i=3;i>0;i--)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("You are done!");


        MyThread thread2=new MyThread();
        thread2.start();
        
        System.out.println(thread2.isAlive());
        System.out.println(thread2.getName());

        System.out.println(thread2.getPriority());
            


    }
}