package Mar20;
import java.util.*;
public class LowerBoundWildcard {
    public static void addNumbers(List<? super Integer> list) { //Sets LOWER bound of the type. Means any object higher in inheritance than Integer can be used.
        for (Object n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        System.out.println("Displaying the Integer values");
        addNumbers(l1);
        List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
        System.out.println("Displaying the Double values");
        addNumbers(l2);
    }
}



