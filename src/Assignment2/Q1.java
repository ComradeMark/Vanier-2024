package Assignment2;
import java.util.*;
import java.util.stream.Collectors;

public class Q1 {
    //Create a tree set with random numbers and find all the numbers which are less than 100 and greater than 5
    public static void main(String[] args) {
        TreeSet<Integer> ints = new TreeSet<Integer>();
        ints.add(2);
        ints.add(152);
        ints.add(25);
        ints.add(681);
        ints.add(76);
        ints.add(1);
        ints.add(299);
        Set<Integer> collect = ints.stream().filter(x-> x>5 && x<100).collect(Collectors.toSet());
        System.out.println(collect);
    }
}

