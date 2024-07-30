import java.io.*;
import java.util.*;
class file1
{
    public static void main(String args[])
    {        
        String s="file1.txt";
        try{
            File file=new File(s);
            FileInputStream fis=new FileInputStream(s);

            if(fis.available()==0)
            {
                throw new EmptyFileException(s);
            }
            else
            {
                int c;
                while ((c=fis.read())!=-1) 
                {
                 System.out.print((char) c);
                }
            }
            fis.close();
        }
        catch (IOException e) 
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
        catch (EmptyFileException e) 
        {
            System.out.println(e.getMessage());
        }
        
    }

}

class EmptyFileException extends Exception {
    public EmptyFileException(String fileName) {
        super("File is empty: " + fileName);
    }
}


