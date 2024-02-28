package Feb28;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception captured: " + e.getMessage()); //Passing our custom error message

        }
        System.out.println("Program continued after throw catching");

    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero dumbass!");
        } else {
            return dividend / divisor;
        }
    }
}