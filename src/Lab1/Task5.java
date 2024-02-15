package Lab1;
import java.util.Scanner;

class Vehicle{
    public Vehicle(String make, String model, int year) {
        System.out.println("General vehicle class instantiated");
    }
    void drive(){
        System.out.println("Vehicle is driving. NON parameterized constructor has been called");
    }
    void drive(int speed){
        System.out.println("Highway driving will be taken into account");
    }
    void drive(String terrain){
        System.out.println("Off-road driving will be taken into account");
    }

}
class Car extends Vehicle{

    public Car(String make, String model, int year) {
        super(make, model, year);
        super.drive();
        System.out.println("Car is driving");
    }
}
class Bike extends Vehicle{

    public Bike(String make, String model, int year) {
        super(make, model, year);
        super.drive();
        System.out.println("Bike is driving");
    }
}
public class Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Make?");
        String make = input.nextLine();
        System.out.println("Model?");
        String model = input.nextLine();
        System.out.println("Year?");
        int year = input.nextInt();
        Car car1 = new Car(make, model, year);
        String terrain = "Off-road";
        int speed = 120;
        //Implementation of HIGHWAY driving method with Car
        car1.drive(speed);
        //Implementation of OFFROAD driving method overloading with string parameter
        car1.drive("Off-road");
        //Implementation of method overriding
        car1.drive();
        //Implementation of method overriding with Bike
        Bike bike1 = new Bike("Chevrolet", "Aveo", 2004);
        bike1.drive(100);
    }
}
