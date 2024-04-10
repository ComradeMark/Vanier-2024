package Apr03;
import java.util.Iterator;
import java.util.ArrayList;
//A set is a collection with NO order
//It is similar to the Mathematical abstraction of a set
//Lists may contain duplicate elements
//Lists are an ordered collection (sometimes called sequences)

//Iterators allow collections to be accessed using a pre defined pointer

public class SetInterface {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(15);
        list.add(22);
        list.add(19);
        list.add(99);

        //Creates iterator called "here" at the beginning of our list. We will now explore how the pointer moves through code.
        Iterator here = list.iterator();
        System.out.println(here.next());
        System.out.println(here.next());
        System.out.println(here.next());
        System.out.println(here.next());
        Iterator here1 = list.iterator();
        here1.next();
        here1.next();
        here1.remove();

        ArrayList<String>list1 = new ArrayList<String>();
        list1.add("this");
        list1.add("is");
        list1.add("a");
        list1.add("test");
        Iterator here2 = list1.iterator();
        String str = (String) here2.next(); //We must typecast, since the iterator is merely a pointer
        System.out.println(str);

        //More efficient casting: generics
        Iterator<String> here3 = list1.iterator();
        String str1 = here3.next();







    }


}
