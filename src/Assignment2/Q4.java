package Assignment2;


//Given a list of numbers, cube them and filter the numbers which are greater 500 and then
//find average of them (use Arrow function)

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> rand = new ArrayList<Integer>();
        rand.add(44);
        rand.add(122);
        rand.add(43);
        rand.add(10);
        rand.add(2);
        rand.add(199);
        Integer[] arr = new Integer[rand.size()];
        arr = rand.toArray(arr);
        rand.stream().map(x -> x*x*x).collect(Collectors.toList()).stream().filter(x -> x>500).collect(Collectors.toList()).stream().mapToDouble(a->a).average().ifPresent(System.out::println);


    }
}
