package Apr18;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class CollectionsStreams {
    public static void main(String[] args) {
        Double[] numbers = {2.5, 55.6, 90.12, 26.6};
        Set<Double> set = new HashSet<>(Arrays.asList(numbers));
        int count = 0;

        for (double e: set)
        {
            if (e > 60) count++;
            System.out.println("Count is: " + count);
        }
    //Instead, do this:
        System.out.println("Count is:" + set.stream().filter(e->e>60).count());


    //A collection stream is a sequence of elements on which one or more operations can be performed
        //Streams are created on a source (arrays, lists or sets)
        //Stream operations are either intermediate or terminal
        // terminal operations -> result a certain type
        //Intermediate operations return the stream itself
        //They can be executed sequential or parallel, and you can chain multiple method calls in a row

        //Streams are lazy -> only executed when the terminal operation is initiated (the last operation)

        //Predicate is a functional interface which accepts an argument and returns a boolean




    }




}
