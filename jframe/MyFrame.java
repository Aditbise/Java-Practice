import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame {
    MyFrame()
    {
        this.setTitle("Jframe title goes here     <----- Tilele name");//sets title
        this.setSize(420,420);//frame size
        this.setVisible(true);//makes frame visible
        this.setResizable(false);//prevent from resizing the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close program when x button is pressed
        ImageIcon image=new ImageIcon("oc.png");//create an ImageIcon
        this.setIconImage(image.getImage());//change icon of frame
        this.getContentPane().setBackground(new Color(100,240,150));//change color of  background
    }
    
}
