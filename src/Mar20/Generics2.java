package Mar20;

import java.util.ArrayList;
import java.util.List;

public class Generics2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        String s = (String) list.get(0); //Typecasting required by default
        //After generics, we no longer need typecasting
        List<String> list1 = new ArrayList<String>();
        list1.add("hello");
        String s1 = list1.get(0);
    }
}
