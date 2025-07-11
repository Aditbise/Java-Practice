import javax.swing.JOptionPane;
import javax.swing.*;
public class Main{
    public static void main (String args[])
    {
        //  JOptionPane.showMessageDialog(null,"Some use less info","Attention!",JOptionPane.PLAIN_MESSAGE);
        //  JOptionPane.showMessageDialog(null,"Here is some more useless info :D","Attention!",JOptionPane.INFORMATION_MESSAGE);
        //  JOptionPane.showMessageDialog(null,"really?","Attention!",JOptionPane.QUESTION_MESSAGE);
        // while(true)
        // {
        //      JOptionPane.showMessageDialog(null,"Something want wrong!","Attention!",JOptionPane.WARNING_MESSAGE);
        // }
        //     JOptionPane.showMessageDialog(null,"Your computer has a virus","Attention!",JOptionPane.ERROR_MESSAGE);

        // System.out.println(        JOptionPane.showConfirmDialog(null,"bro do you even code?","Title box",JOptionPane.YES_NO_CANCEL_OPTION)        );
        // String name=JOptionPane.showInputDialog("What is your name?:");
        // System.out.println("HI "+name);
        String responses[]={"No,you're awesom!","thank you!","*blush*"};
        ImageIcon icon=new ImageIcon("image.jpg");
        JOptionPane.showOptionDialog(null,"You re awesome","secrate message",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,icon,responses,0);
    }
}