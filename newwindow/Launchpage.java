
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Launchpage extends JFrame implements ActionListener {

    JPanel panel=new JPanel();
    JButton button=new JButton("Click");
    Launchpage()
    {
        button.addActionListener(this);
    

        panel.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.add(panel);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            Newwindow window=new Newwindow();
        }
    }
    
}
