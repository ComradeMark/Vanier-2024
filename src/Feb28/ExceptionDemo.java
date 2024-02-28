package Feb28;

public class ExceptionDemo {
    public static void main(String[] args) {
        int data = 50/0;
        System.out.println("Print has to be executed");
    //There exist checked and unchecked exceptions
    /* Checked exceptions:
    Checked at compile-time by compiler. These exceptions are typically related to external factors out of control of the program, such as I/O exceptions, network ops.
    ex: IOException, FileNotFoundException, ClassNotFoundException
    It is mandatory to either catch these exceptions using a try-catch block or declare that the method throws these exceptions using the 'throws' keyword

    Unchecked exceptions:
    Unchecked exceptions are NOT checked at compile time and occur due to programming errors or unexpected conditions during runtime (ex: OutOfBoundsException).
     */


//Common Java Exception scenarios:

   //Case1:
        int a = 50/0;//ArithmeticException
   //Case2:
        String s = null;
        System.out.println(s.length()); //NullPointerException


    }




}
