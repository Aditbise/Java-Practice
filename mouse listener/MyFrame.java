import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;
    ImageIcon dizzy;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);


    }
    @Override
    public void mouseClicked(MouseEvent e)
    {
        // System.out.println("Mouse Clicked ");
        // label.setBackground(Color.yellow);
    } 
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Mouse Pressed");
        label.setBackground(Color.green);
    } 
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Mouse Released");
        label.setBackground(Color.yellow);
    } 
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Mouse entered the component");
        label.setBackground(Color.blue);
    } 
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Mouse exited the component");
        label.setBackground(Color.red);

    } 
    
}
