package Feb8;

public class StaticDemo3 {
    int newValue = 4;

    static{
        System.out.println("Will this static block be printed?");
    } //Static block will be executed without an instance
    //As soon as PSVM is run, compiler looks for any static blocks and executes them


    static int cube(int a){
        return a * a * a;
    }


    void display(){
        System.out.println("NewValue = " + newValue); //NewValue is encapsulated and can only be accessed through an object (container)
    }

    //To access static method, use class name
    public static void main(String[] args) {
        System.out.println("The cube of 10 is: " + StaticDemo3.cube(10));
    }



}
