import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Newwindow implements ActionListener{
    JFrame frame=new JFrame();
    JLabel label=new JLabel("yo");
    JButton button=new JButton("Click me");
    Newwindow()
    {
        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        button.setBounds(100,160,200,40);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(label);
        frame.add(button);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==button) {
            System.out.println("yello!!");

        }
    }
    
}
