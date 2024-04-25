package Lab3;

import java.util.*;

//Write a Java program to find the greatest key and the least key in a map.
public class A5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(12, "Mark");
        hmap.put(2, "Bell");
        hmap.put(27, "Sanjeet");
        hmap.put(116, "Oryx");

        Set<Integer> keys = hmap.keySet();
        TreeSet<Integer> ts1 = new TreeSet<>();
        System.out.println(keys);
        String keystring = keys.toString();

    }
}













