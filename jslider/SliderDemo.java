import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;

public class SliderDemo implements ChangeListener {
    
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo()
    {
        frame=new JFrame();
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,50);


        slider.setPreferredSize(new DimensionUIResource(400,200));
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new FontUIResource("MV Boli",FontUIResource.PLAIN,15));
        label.setFont(new FontUIResource("MV Boli",FontUIResource.PLAIN,15));

        slider.setOrientation(SwingConstants.VERTICAL);

        slider.addChangeListener(this);


        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        
        frame.setSize(500,500);
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void stateChanged(ChangeEvent e)
    {
        label.setText("C = "+slider.getValue());
    }
}
