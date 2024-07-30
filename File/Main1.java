import java.io.*;
import java.util.*;
public class Main1 {
    public static void main(String args[])
    {
        try{
            FileWriter writer =new FileWriter("poem.txt");
            writer.write("Roser are red! \nViolets are blue");
            writer.append("\n(a poem ..... i forgot my name)");
            writer.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
    }
    
}
