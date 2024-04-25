package Lab3;



import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

//Write a Java program to display the values of a tree map whose
      //  keys are less than a given key
public class A6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(15, "Mark");
        tm.put(21, "Bell");
        tm.put(6, "Sunjit");
        tm.put(16, "Lisa");
        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println("Input cutoff number for key value: ");
        Scanner input = new Scanner(System.in);
        int keyval = input.nextInt();
        System.out.println("Entries with key values lesser than " + keyval + tm.headMap(keyval, false));

    }
}


