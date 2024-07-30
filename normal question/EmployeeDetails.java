import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeDetails extends JFrame implements ActionListener {

    // GUI Components
    JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9, label10;
    JTextField textfield1, textfield2;
    JButton button1;
    JRadioButton radiobutton1, radiobutton2, radiobutton3;
    ButtonGroup buttongroup1;
    JCheckBox checkbox1, checkbox2, checkbox3;
    JTable table;
    JScrollPane scrollpane;
    String data[][] = {
            {"1", "Ram", "1000"},
            {"2", "Raj", "2000"}
    };
    String column[] = {"ID", "NAME", "SALARY"};

    // Constructor
    public EmployeeDetails() {
        // Set title for frame
        super("Employee Details");
        // Set layout to GridBagLayout
        setLayout(new GridBagLayout());
        // Create GridBagConstraints object
        GridBagConstraints gbc = new GridBagConstraints();
        // Set first name label and textfield
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label1 = new JLabel("First Name:");
        add(label1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        textfield1 = new JTextField();
        add(textfield1, gbc);
        // Set second name label and textfield
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label2 = new JLabel("Second Name:");
        add(label2, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        textfield2 = new JTextField();
        add(textfield2, gbc);
        // Set Department labels and radio buttons
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label3 = new JLabel("Department:");
        add(label3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        radiobutton1 = new JRadioButton("ME");
        add(radiobutton1, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        radiobutton2 = new JRadioButton("CSE");
        add(radiobutton2, gbc);
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        radiobutton3 = new JRadioButton("ECE");
        add(radiobutton3, gbc);
        // Create a button group for radio buttons
        buttongroup1 = new ButtonGroup();
        buttongroup1.add(radiobutton1);
        buttongroup1.add(radiobutton2);
        buttongroup1.add(radiobutton3);
        // Set Proficiency Level label and text field
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label4 = new JLabel("Proficiency Level:");
        add(label4, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label5 = new JLabel("1");
        add(label5, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label6 = new JLabel("2");
        add(label6, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label7 = new JLabel("3");
        add(label7, gbc);
        // Set State and Uttar Pradesh labels
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label8 = new JLabel("State");
        add(label8, gbc);
        gbc.gridx = 5;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label9 = new JLabel("Uttar Pradesh");
        add(label9, gbc);
        // Set Qualification labels and check boxes
        gbc.gridx = 4;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        label10 = new JLabel("Qualifications");
        add(label10, gbc);
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        checkbox1 = new JCheckBox("10th");
        add(checkbox1, gbc);
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        checkbox2 = new JCheckBox("12th");
        add(checkbox2, gbc);
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        checkbox3 = new JCheckBox("B.Tech");
        add(checkbox3, gbc);
        // Set Employee Details label
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        JLabel label11 = new JLabel("Employee Details");
        add(label11, gbc);
        // Set the table
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        table = new JTable(data, column);
        scrollpane = new JScrollPane(table);
        add(scrollpane, gbc);
        // Set Submit button
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        button1 = new JButton("Submit");
        add(button1, gbc);
        // Set action listener for submit button
        button1.addActionListener(this);
        // Set frame size and visibility
        setSize(800, 400);
        setVisible(true);
    }

    // Action Listener for submit button
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(this, "Submitted Successfully!");
        }
    }

    // Main method
    public static void main(String[] args) {
        new EmployeeDetails();
    }
}