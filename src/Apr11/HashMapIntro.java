package Apr11;

/**
HashMaps is a map based collection that is used for storing key and value pairs, denoted as HashMap<Key,Value> or HashMap<K,V>.
This class makes no guarantees as to the order of the map.
It does not sort the stores keys and values.

 -Contains only unique keys
 -May have one null key and multiple null values
 - HashMap is non synchronized
 -Contains no order
 - Default capacity of HashMap class is 16 with a load factor of 0.75

 */
import java.util.*;
public class HashMapIntro {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer,String>(); //Creating HashMap
        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");
        //If we add a new value with an existing key, the old one will be overwritten

        System.out.println("Iterating HashMap: ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " +m.getValue());
        }
        map.put(1, "Balls");
        System.out.println("Iterating modified HashMap: ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " " +m.getValue());
        }
    }

}
