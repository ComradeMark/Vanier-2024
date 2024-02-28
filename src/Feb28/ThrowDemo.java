package Feb28;

public class ThrowDemo {
    static void validate(int age){

        if(age<18)
            throw new ArithmeticException("Not of age");

        else System.out.println("You can vote");

    }

    public static void main(String[] args) {
        validate(13);
        validate(19);
        System.out.println("Remaining code");
    }
}
