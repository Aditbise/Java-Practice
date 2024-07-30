import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Car car=new Car("Chevrolet","Camero",2021);


        car.setyear(2022);


        System.out.println(car.getMake());  
        System.out.println(car.getModel());        
        System.out.println(car.getyear());
    }
}
