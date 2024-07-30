import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
public class MyFrame extends JFrame implements ActionListener{

    JButton button;
    int a=0;
    MyFrame()
    {
        ImageIcon image = new ImageIcon("12.png");


        button = new JButton("Click me");
        button.setBounds(200,100,250,100);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setIcon(image);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.GRAY);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(button);
        this.setVisible(true);
        
    }    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button && a<=5)
        {
            System.out.println("poow");
            a++;
        }
        else if(e.getSource()==button && a>5 && a<=10)
        {
            System.out.println("stop it!!!!!!!!!");
            a++;
        }
        else if(e.getSource()==button && a>10)
        {
            System.out.println("you want me find your IP???");
            button.setEnabled(false);//to enable and desble button
        }
    }
}