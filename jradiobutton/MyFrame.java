import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.*;
import java.awt.event.*;
public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzabutton;
    JRadioButton hamburgerbutton;
    JRadioButton hotdogbutton;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzabutton = new JRadioButton("pizza");
        pizzabutton.setFocusable(false);
        hamburgerbutton = new JRadioButton("hamburger");
        hamburgerbutton.setFocusable(false);
        hotdogbutton = new JRadioButton("hotdogburger");
        hotdogbutton.setFocusable(false);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzabutton);
        group.add(hamburgerbutton);
        group.add(hotdogbutton);

        pizzabutton.addActionListener(this);
        hamburgerbutton.addActionListener(this);
        hotdogbutton.addActionListener(this);

        this.add(pizzabutton);
        this.add(hamburgerbutton);
        this.add(hotdogbutton);

        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==pizzabutton)
            System.out.println("You ordered a pizza");
        else if(e.getSource()==hamburgerbutton)
            System.out.println("You ordered a hamburger");
        else if(e.getSource()==hotdogbutton)
            System.out.println("You ordered a hotdog");
    }
}
