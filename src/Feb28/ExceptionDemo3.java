package Feb28;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            int data = 25 / 0;
            System.out.println(data);

        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block always executed"); //Finally block can be used to execute closing a connection or a stream after accessing a port
        }
        System.out.println("Remaining code");}
}
