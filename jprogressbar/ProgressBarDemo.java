import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {
    
    JFrame frame=new JFrame();
    JProgressBar bar=new JProgressBar();


    ProgressBarDemo()
    {
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);//add percentage top bar

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill()
    {
        int c=0;
        while(c<=100)
        {
            bar.setValue(c);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
                // TODO: handle exception
            }
            c=c+1;
        }
        bar.setString("Done !!");
    }
}
