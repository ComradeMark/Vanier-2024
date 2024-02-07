public class ChildClass extends ExampleClass{
    int int2;
    double double2;
    String string2;

//SUPER ASSIGNS VALUE FROM CHILD CLASS TO PARENT CLASS
    public ChildClass(int int2, double double2, String string2) {
        this.int2 = int2;
        this.double2 = double2;
        this.string2 = string2;
    }

    public ChildClass(int intValue, double doubleValue, String stringValue, int int2, double double2, String string2) {
        super(intValue, doubleValue, stringValue);
        this.int2 = int2;
        this.double2 = double2;
        this.string2 = string2;
    }

    public ChildClass(ExampleClass other, int int2, double double2, String string2) {
        super(other);
        this.int2 = int2;
        this.double2 = double2;
        this.string2 = string2;
    }

    public ChildClass(int intValue, double doubleValue, int int2, double double2, String string2) {
        super(intValue, doubleValue);
        this.int2 = int2;
        this.double2 = double2;
        this.string2 = string2;
    }

    public ChildClass(String stringValue, int int2, double double2, String string2) {
        super(stringValue);
        this.int2 = int2;
        this.double2 = double2;
        this.string2 = string2;
    }
void displayChild(){
    System.out.println("IntValue " + intValue);
    System.out.println("DoubleValue " + doubleValue);
    System.out.println("StringValue " + stringValue );
    System.out.println("childInt " + int2);
    System.out.println("childDouble " + double2);
    System.out.println("childString " + string2 + "\n");
}
    public static void main(String[] args) {
        ChildClass childObject1 = new ChildClass(1, 11.2, "balls", 3, 77.6, "couilles"); //Prints parent class variables
        System.out.println("Values from just Parent ");
        childObject1.displayValues();
        System.out.println("Values from Child and parent");
        childObject1.displayChild();
    }
}
