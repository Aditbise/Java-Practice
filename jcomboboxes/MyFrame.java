import java.awt.*;
import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox combobox;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        String animals[]={"dog","cat","hen"};
        combobox=new JComboBox<>(animals);
        combobox.addActionListener(this);

        // combobox.setEditable(true);
        // System.out.println(combobox.getItemCount());
        // combobox.addItem("horse");
        // combobox.insertItemAt("pig", 0);
        // combobox.setSelectedIndex(0);
        // combobox.removeItem("cat");
        // combobox.removeItemAt(0);
        // combobox.removeAllItems();
        
        this.add(combobox);


        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==combobox)
        {
            System.out.println(combobox.getSelectedItem());
        }
    }
}
