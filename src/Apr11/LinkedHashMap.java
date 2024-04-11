package Apr11;
import java.util.*;
/**
 * LinkedHasMap class is hashable and linked implementation of the map interface
 * Similar to HashMap, but maintains order of insertion of elements
 * Provides easy way to insert, delete, and search the elements, but does not provide any way to maintain and track the order of the inserted elements
 */
public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer,String>hm = new java.util.LinkedHashMap<>();
        hm.put(100,"Jack");
        hm.put(101,"Heh");
        hm.put(103,"Stalin");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
