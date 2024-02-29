package Feb29;

public class ThrowDemoCast {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result " + result);
        }
        catch(ArithmeticException ex){
            System.out.println("Exception could be caught here \n" + ex.getMessage());
        }

        System.out.println("Normal code continues here"); //This line must be executed


    }

    private static int divide(int dividend, int divisor) {

        if(divisor == 0){
            throw new ArithmeticException("Unable to divide by zero");
        }
        return dividend/divisor;

    }

}
