import java.io.*;
import java.util.*;
public class Main {
    
    public static void main(String args[])
    {
        File file=new File("Secrate_message.txt");
        if(file.exists())
        {
            System.out.println("That file exist!! :o!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else
        {
            System.out.println("That file doesn't exist :(");
        }
    }
}
    
