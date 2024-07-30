import java.util.*;
import java.lang.*;
class arraylist2 
{
    public static void main(String args[])
    {
        ArrayList<ArrayList<String>> grocerylist=new ArrayList<ArrayList<String>>(); 

        ArrayList<String> bakerylist =new ArrayList<String>();
        bakerylist.add("paste");
        bakerylist.add("garlic bread");
        bakerylist.add("donuts");
        ArrayList<String> productlist=new ArrayList<String>();
        productlist.add("tomato");
        productlist.add("spinich");
        productlist.add("pepper");
        ArrayList<String> drinklist=new ArrayList<String>();
        drinklist.add("coke");
        drinklist.add("juice");
        drinklist.add("milk");

        System.out.println();
        grocerylist.add(bakerylist);
        grocerylist.add(productlist);
        grocerylist.add(drinklist);

        for(int i=0;i<3;i++)
        {
            System.out.println(grocerylist.get(i));
        }
        
    }
}
