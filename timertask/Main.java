import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
class Main
{
    public static void main(String args[])
    {
        Timer timer = new Timer();

        System.out.println("Task starting"); 
        TimerTask task=new TimerTask() {
            

            int count=10;
            @Override
            public void run()
            {
                if(count>0)
                {
                    System.out.println(count+" sec");
                    count--;
                }
                else
                {
                    System.out.println("HAPPY NEW YEAR");
                    timer.cancel();
                }
            }
        };

        Calendar date= Calendar.getInstance();
        // date.set(Calander.YEAR,2024);
        // data.set(Calander.MONTH,Calander.JULY);
        // data.set(Calendar.DAY_OF_MONTH,11);
        // data.set(Calander.HOUR_OF_DAY,0);
        // data.set(Calander.MINUTE,0);
        // data.set(Calander.SECOND,0);
        // data.set(Calander.MILLISECOND,0);

        // timer.schedule(task, data.getTimer());


        // timer.schedule( task, 3000);

        timer.scheduleAtFixedRate(task, 0, 1000);

    }
}