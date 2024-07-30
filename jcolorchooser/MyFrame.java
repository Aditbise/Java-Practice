import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener  {
    JButton button;
    JColorChooser chooser;
    JLabel label;
    MyFrame()
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button =new JButton("Color");
        button.setFocusable(false);
        button.addActionListener(this);

        label=new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("this is some text");
        label.setFont(new Font("MV Boli",Font.PLAIN, 100));
        label.setOpaque(true);
        
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed( ActionEvent e )
    {
        if(e.getSource()==button)
        {
           chooser=new JColorChooser();

           Color color = JColorChooser.showDialog(null,"Pick color",Color.BLACK);   

        //    label.setForeground(color);

           label.setBackground(color);
        }
    }
    
}
