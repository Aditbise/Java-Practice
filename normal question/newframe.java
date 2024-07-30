import javax.swing.*;
import java.awt.*;

public class newframe extends JFrame {
    public newframe() {
        
        setLayout(new FlowLayout()); 
        JButton b1 = new JButton("click");
        add(b1);  
    }

    public static void main(String args[]) {
        newframe nf1 = new newframe();
        nf1.setSize(1080, 720);
        nf1.setVisible(true);
    }
}
