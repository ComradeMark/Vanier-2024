package Apr03;
import java.util.Iterator;
public class IterableInterface implements Iterable<String> {
    //Making a container iterable means a container can be iterated. This lets us use the methods of Iterable on a container without actually calling an iterator
    private String[] elements;
    public IterableInterface(String[] elements){
        this.elements = elements;
    }
    public Iterator<String> iterator(){
        return new MyIterator();
    }
    private class MyIterator implements Iterator<String>{
        private int index = 0;
        public boolean hasNext(){
            return index<elements.length;
        }
        public String next(){
            return elements[index++];
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        IterableInterface iterable = new IterableInterface(names);
        for(String name : iterable){
            System.out.println(name);
        }
    }

}
