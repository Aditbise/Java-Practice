public class Car extends Vehicle{

    Car()
    {
        String make="Chevrolet";
        String model="Corvette";
        int year =2020;
        String color="blue";
        double price=50000.00;
    }
    void go()
    {
        System.out.println("The vehicle is Car");
    }
    void drive()
    {
        System.out.println("You drive the car");
    }
    void breaks()
    {
        System.out.println("You step on the breaks");
    }
}
