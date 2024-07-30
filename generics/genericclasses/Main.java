
public class Main {

    public static void main(String[] args) {
        
        MyGenericClass <Integer> myInt = new MyGenericClass<>(45);
        MyGenericClass <Double> myDouble = new MyGenericClass<>(1.02);
        MyGenericClass <Character> myChar = new MyGenericClass<>('s');
        MyGenericClass <String> myStr = new MyGenericClass<>("Hello");

        
        
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myStr.getValue());

    }
}
