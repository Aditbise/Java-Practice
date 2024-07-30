import java.util.*;
class arraylist
{
    public static void main(String args[])
    {
        ArrayList<Integer> number =new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);
        System.out.println(number.toString());
        System.out.println(number.get(2));
        
        number.remove(2);
        System.out.println(number.toString());
        
        number.remove(Integer.valueOf(5));
        System.out.println(number.toString());

        number.clear();
        System.out.println(number.toString());

        number.add(6);
        number.add(2);
        number.add(4);
        number.add(5);
        number.add(1);
        System.out.println(number.toString());
        
        number.sort(Comparator.naturalOrder());
        System.out.println(number.toString());
        
        number.set(2,Integer.valueOf(11));
        System.out.println(number.toString());
        
        number.sort(Comparator.reverseOrder());
        System.out.println(number.toString());

        System.out.println(number.size());
        
        System.out.println(number.contains(Integer.valueOf(1)));
        
        System.out.println(number.contains(Integer.valueOf(12)));

        System.out.println(number.isEmpty());
        
        number.clear();
        System.out.println(number.isEmpty());

        number.add(6);
        number.add(2);
        number.add(4);
        number.add(5);
        number.add(1);
        System.out.println("Before"+number.toString());

        number.forEach(n -> {
            number.set(number.indexOf(n) , n*2);
        });

        System.out.println("After"+number.toString());
    }
}