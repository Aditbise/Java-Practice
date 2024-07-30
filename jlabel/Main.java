import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
public class Main {
    public static void main(String args[])
    {
        ImageIcon image=new ImageIcon("qwe.png");
        // ImageIcon image2=new ImageIcon("wwa.png");
        Border border=BorderFactory.createLineBorder(new Color(0X808080),2);

        JLabel label=new JLabel();//create label
        label.setText("Bro do you even code?");//set text as label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,CENTER,RIGHTof image 
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP,CENTER,BOTTOM of imageicin
        label.setForeground(new Color(0X808080));//set font color of the text
        label.setFont(new Font("Ariel",Font.PLAIN,90));//set font of text
        label.setIconTextGap(-100);//set gap between the text and image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true);//display the background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of incon+text within label
        label.setHorizontalAlignment(JLabel.LEFT);
        // label.setBounds(0, 0, 250, 250);


        JFrame frame=new JFrame();
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        // frame.setLayout(null);
        frame.add(label);
        frame.pack();
    }
    
}
