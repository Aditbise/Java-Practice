import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Jframe1
{
    public static void main(String args[]) 
    {
        JLabel label1=new JLabel("First Number");
        JLabel label2=new JLabel("Second Number");
        JLabel label3=new JLabel("Result");
        JTextArea text=new JTextArea(30,40);

        
        JTextField textfield1=new JTextField("",20);
        JTextField textfield2=new JTextField("",20);
        JTextArea textarea=new JTextArea(5,20);
        textarea.setEditable(false);

        JButton sumButton=new JButton("Sum");
        JButton subtractButton=new JButton("Subtract");
        JButton multiplyButton=new JButton("Multiply");
        JButton divideButton=new JButton("Divide");
        JButton exitButton=new JButton("Exit");

        JFrame frame=new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,500);
        frame.add(label1);
        frame.add(textfield1);
        
        frame.add(label2);
        frame.add(textfield2);

        frame.add(sumButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(exitButton);

        frame.add(label3);
        frame.add(textarea);
        frame.add(new JScrollPane(textarea));

        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        sumButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    double num1 = Double.parseDouble(textfield1.getText());
                    double num2 = Double.parseDouble(textfield2.getText());

                    double result = num1+num2;

                    textarea.setText("Sum : "+result);

                }
                catch(NumberFormatException ex)
                {
                    textarea.setText("Not a valid expression");
                }
            }
            

        });
        subtractButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    double num1 = Double.parseDouble(textfield1.getText());
                    double num2 = Double.parseDouble(textfield2.getText());

                    double result = num1-num2;

                    textarea.setText("Sub : "+result);

                }
                catch(NumberFormatException ex)
                {
                    textarea.setText("Not a valid expression");
                }
            }
            

        });
        multiplyButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    double num1 = Double.parseDouble(textfield1.getText());
                    double num2 = Double.parseDouble(textfield2.getText());

                    double result = num1*num2;

                    textarea.setText("Multi : "+result);

                }
                catch(NumberFormatException ex)
                {
                    textarea.setText("Not a valid expression");
                }
            }
            

        });
        divideButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                try{
                    double num1 = Double.parseDouble(textfield1.getText());
                    double num2 = Double.parseDouble(textfield2.getText());

                    double result = num1/num2;

                    textarea.setText("Div : "+result);

                }
                catch(NumberFormatException ex)
                {
                    textarea.setText("Not a valid expression");
                }
            }
            

        });
        exitButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {
                if(e.getSource() == exitButton)
                    System.exit(0);
            }
            

        });
        
    }
}

