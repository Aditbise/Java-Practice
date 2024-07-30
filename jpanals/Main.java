import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String args[])
    {
        ImageIcon image1=new ImageIcon("qwa.png");
        ImageIcon image2=new ImageIcon("wwa.png");

        JLabel label1=new JLabel();
        label1.setText("Bro do you even code?");
        label1.setIcon(image1);
        label1.setFont(new Font("Ariel",Font.PLAIN,90));

        JLabel label2=new JLabel();
        label2.setText("Yes");
        label2.setIcon(image2);
        label2.setFont(new Font("Ariel",Font.PLAIN,90));

        
        
        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel=new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);
        
        JPanel greenpanel=new JPanel();
        greenpanel.setBackground(Color.green);
        greenpanel.setBounds(0,250,500,500);


        JFrame frame =new JFrame();
        frame.setSize(1920,1080);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        redpanel.add(label1);
        bluepanel.add(label2);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
    
}
