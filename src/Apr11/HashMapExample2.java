package Apr11;
import java.util.*;
public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<Integer,String>hmap = new HashMap<Integer,String>();
        hmap.put(12, "Mark");
        hmap.put(2, "Bell");
        hmap.put(27, "Sanjeet");
        hmap.put(116, "Oryx");
    //Display using Iterator
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is: " + mentry.getKey() + " And value is: " + mentry.getValue());
        }
        //Get values based on key
        String var = hmap.get(2);
        System.out.println("Value at index 2 is: " + var);
        //Remove values based on key
        hmap.remove(3);
        hmap.putIfAbsent(103,"Garry");
        System.out.println("Map key and values after removal and addition: ");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()){
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.println("Key is: " + mentry2.getKey() + " And value is: " + mentry2.getValue());
        }
    }
}
