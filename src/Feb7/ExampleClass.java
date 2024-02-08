package Feb7;

public class ExampleClass {
    int intValue;
    double doubleValue;
    String stringValue;

    //default constructor

    public ExampleClass() {
        intValue = 0;
        doubleValue = 0.0;
        stringValue = "Default";
    }

    //Parameterized constructor
    public ExampleClass(int intValue, double doubleValue, String stringValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
    }

    public ExampleClass(ExampleClass other) {
        this.intValue = other.intValue;
        this.doubleValue = other.doubleValue;
        this.stringValue = other.stringValue;
    }

//Constructor overloading
    ExampleClass(int intValue, double doubleValue){
        this.intValue = intValue;
        this.doubleValue = doubleValue;
        this.stringValue = "OverLoaded";
    }
    ExampleClass(String stringValue){
        this.intValue = 42;
        this.doubleValue = 10.5;
        this.stringValue = stringValue;
    }
void displayValues(){
        System.out.println("IntValue " + intValue);
        System.out.println("DoubleValue " + doubleValue);
        System.out.println("StringValue " + stringValue + "\n");
    }
    //additional methods
    void performCalculation(){
        System.out.println(" Performing Calculation");

    }
    String getStringValue(){
        return stringValue;
    }
void setIntValue(int intValue){
        this.intValue = intValue;
}

    public static void main(String[] args) {
        ExampleClass defaultInstance = new ExampleClass(); //Displays default values from default constructor
        defaultInstance.displayValues();

        ExampleClass parameterizedInstance = new ExampleClass(100, 11.8, "Hello");
        parameterizedInstance.displayValues();

        //Using copy constructor
        ExampleClass copyInstance = new ExampleClass(parameterizedInstance);
        parameterizedInstance.displayValues();

        //Using overloaded constructor
        ExampleClass overloadedInstance = new ExampleClass(250, 99.9); //Calls constructor that ONLY EXPECTS 2 ARGUMENTS
        overloadedInstance.displayValues();

        //Using overloaded constructor to call constructor that ONLY expects String
        ExampleClass overloadedInstance2 = new ExampleClass("Montreal");
        overloadedInstance2.displayValues();

        ExampleClass oneMoreObject = new ExampleClass();
        oneMoreObject.intValue = 999;
        oneMoreObject.doubleValue = 101.3;
        oneMoreObject.stringValue = "haha";
        oneMoreObject.displayValues();
        oneMoreObject.performCalculation();
    }

}
