package Mar20;
import java.util.*;
public class HashMapIntro {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"vijay");
        map.put(4,"umesh");
        map.put(2,"ankit");

        Set<Map.Entry<Integer,String>>set = map.entrySet();
        Iterator<Map.Entry<Integer,String>>itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry e = itr.next();
            System.out.println(e.getKey()+" " + e.getValue());
        }
    }
}
