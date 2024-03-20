package Mar20;
import java.util.*;

class TestGenerics1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rahul");
        list.add("test");
        String s = list.get(1);
        System.out.println("Element is: " + s);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
//Generic method arguments:
//T - Type
//E - Element
//K - Key
//N - Number
//V - Value
