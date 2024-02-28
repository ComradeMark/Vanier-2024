package Feb28;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        //Case 1:
        try {
            //code that may raise exception
            int data = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //remaining code of program
        System.out.println("Remaining code...");

        //Case 2:
        try {
            //code that may raise exception
            int data = 100;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        //remaining code of program
        System.out.println("Remaining code..."); //Remaining code is printed because no exception exists

        //Catch multiple exceptions:

        System.out.println("\n\nCatch multiple exceptions:\n");
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Task 1 = ArithmeticException");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Task 2 = IndexOutOfBounds");
        } catch (Exception e) {
            System.out.println("Common exception task completed");
        }
        System.out.println("Remaining code");
//Catch blocks must be ordered from the most specific to the most general i.e. Catch for ArithmeticException must come before catch for Exception

        //Nested try catch

        System.out.println("\n\n Nested try catch: \n");
        try {
            try {
                System.out.println("Going to divide");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Other statement");
        } catch (Exception e) { //Used to catch any other exception we're unsure of (Parent of exception class)
            System.out.println("Handled");


        }
        finally{ //Finally block always executed whether exception handled or not
            System.out.println("Flow resumed.");}
        System.out.println("Back to normal flow");


    }
}


