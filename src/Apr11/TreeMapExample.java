package Apr11;
import java.util.*;
public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String>map = new TreeMap<Integer,String>();
        map.put(100,"Balls");
        map.put(102,"Bells");
        map.put(101,"Villeray");
        map.put(103,"Rahul");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue()); //Notice how TreeMap orders the data
        }
        //Maintains descending order
        System.out.println("descendingMap: " + map.descendingMap());
        //Returns KV pairs whose keys are less or equal to specified key
        System.out.println("headMap: " + map.headMap(102,true));

    }
}
