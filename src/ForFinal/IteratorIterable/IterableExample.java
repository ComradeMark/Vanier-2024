package ForFinal.IteratorIterable;

import java.util.Iterator;
import java.util.Arrays;

class MyIterable implements Iterable<String> {
    private final String[] array = {"Apple", "Banana", "Cherry"};

    public Iterator<String> iterator() {
        return Arrays.asList(array).iterator();
    }
}

public class IterableExample {
    public static void main(String[] args) {
        MyIterable iterable = new MyIterable();
        for (String s : iterable) {
            System.out.println(s);
        }
    }
}

