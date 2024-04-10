package Apr03;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//We can extend the properties of the Iterator interface by calling ListIterator (which extends Iterator)

public class IteratorExtension {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(22);
        list.add(19);
        list.add(99);
        System.out.println(list + "\n");
        ListIterator here = list.listIterator();
        System.out.println(here.next());
        here.set(27);
        System.out.println(list);
        here.next();
        here.next();
        here.next(); //-1 is the index out of bounds
        System.out.println(here.previousIndex());
        System.out.println(here.nextIndex());

        //Stepping through a list backwards
        for(ListIterator i = list.listIterator(list.size());i.hasPrevious();){

        }
    }
}
