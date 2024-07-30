import javax.swing.JFrame;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menubar;
    JMenu filemenu;
    JMenu editmenu;
    JMenu helpmenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    MyFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500); 
        this.setLayout(new FlowLayout());

        menubar=new JMenuBar();
        
        filemenu=new JMenu("File");
        editmenu=new JMenu("Edit");
        helpmenu=new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("save");
        exitItem = new JMenuItem("Exit");
        
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);


        filemenu.add(loadItem);
        filemenu.add(saveItem);
        filemenu.add(exitItem);
        
        menubar.add(filemenu);
        menubar.add(editmenu);
        menubar.add(helpmenu);


        this.setJMenuBar(menubar);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==loadItem)
        {
            System.out.println(" You loaded a file ");
        }
        else if(e.getSource()==saveItem)
        {
            System.out.println(" You saved a file ");
        }
        if(e.getSource()==exitItem)
        {
            System.exit(0);
        }
    }
}
