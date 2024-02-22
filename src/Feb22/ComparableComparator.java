package Feb22;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class ComparableComparator {
    public static void main(String[] args) {
        int[] arr = {11,45345,7657,6567,3,723};
        Arrays.sort(arr);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(arr));
        String[] names = {"James", "Robert", "Micharl", "jeremy", "Bobert", "loser", "peter"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        List<String> fruits = new ArrayList(); //Upcasting to List instead of ArrayList - see chart
        fruits.add("apple");
        fruits.add("aPple");
        fruits.add("APple");
        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList");
        System.out.println(fruits);




    }

}
