package Apr03;
import java.util.Iterator;
import java.util.ArrayList;
public class RemoveIfEquals {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Before modification: " + "\n " + names);
        //Obtain an Iterator instance from the Collection
        Iterator<String> iterator = names.iterator();
        //Iterating through the collection using our iterator
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.equals("Bob")){
                iterator.remove(); //removes Bob from the collection. IMPORTANT: CALL ITERATOR.REMOVE INSTEAD OF NAMES.REMOVE
            }
        }
        System.out.println(names);
    }
}
