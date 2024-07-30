import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
public class MyPanel extends JPanel {
    MyPanel()
    {
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g)
    {
        Graphics2D g2d=(Graphics2D)g;
        
        g2d.setPaint(Color.blue);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0,0,500,500);
        g2d.drawRect(0, 0, 100, 200);
        g2d.fillRect(0, 0, 100, 200);
        g2d.drawOval(0, 0, 100, 100);
        g2d.fillOval(0, 0, 100, 100);
        g2d.drawArc(0, 0, 100, 100, 0, 180);
        g2d.fillArc(100,100, 100, 100, 0, 180);

        
        g2d.setPaint(Color.white);
        g2d.fillArc(100, 100, 100, 100,180, 180);
        
        
        g2d.setPaint(Color.gray);
        g2d.drawLine(100, 150, 200, 150);


        g2d.fillOval(135, 135, 30, 30);


        g2d.setStroke(new BasicStroke(5));
        g2d.setPaint(Color.gray);
        g2d.drawArc(100,100, 100, 100, 0, 180);
        g2d.setPaint(Color.gray);
        g2d.drawArc(100, 100, 100, 100,180, 180);

        int xpoints[]={150,250,350};
        int ypoints[]={300,150,300};
        g2d.setPaint(Color.green);
        g2d.fillPolygon(xpoints,ypoints,3);

        g2d.drawString("bro no co do ",200,200);

    }
}
