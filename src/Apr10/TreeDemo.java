package Apr10;
import java.util.*;
public class TreeDemo {
    public static void main(String[] args) {
        Set<String> ts1 = new TreeSet<>();
        ts1.add("B");
        ts1.add("B");
        ts1.add("A");
        //Dupes not inserted
        ts1.add("B");
        //Elements get stored by default sorting order (Ascending)
        System.out.println(ts1);
    }
}

