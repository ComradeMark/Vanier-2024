package Feb29;

public class MultipleThrow {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result " + result);
        }
        catch(ArithmeticException ex){
            System.out.println("Caught here \n" + ex.getMessage());
        }

        System.out.println("Normal code continues here"); //This line must be executed


    }
    /*The 'throw' keyword is used to explicitly throw an exception from within a block of code or a method. The 'throws'
     keyword is used in the method signature to declare the exceptions that a method can potentially throw. The 'throw'
     keyword can only throw a single exception at a time.*/

    //Throw: We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions
    //Throws: We can declare multiple exceptions using throws keyword that can be thrown by the method
    private static int divide(int divident, int divisor)throws ArithmeticException{ //Throws keyword lets us catch an exception if it exists
        if(divisor ==0){
            System.out.println("Divide by zero error"); //Error is now captured in PSVM block instead of the method itself

        }
        return divident/divisor;
}

}
