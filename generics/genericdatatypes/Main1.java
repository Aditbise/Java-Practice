package generics.genericdatatypes;
import java.util.ArrayList;

class Main1 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(22);
        list.add(43);
        list.add(64);
        list.add(95);
        System.out.println(list.toString());

        list.add(90);
        list.add(15);
        System.out.println(list.toString());

        list.add(2, 45);
        System.out.println(list.toString());

    }
}
