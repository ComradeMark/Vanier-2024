package Mar27;

import java.util.Iterator;
import java.util.Stack;

public class ArrayStackImplement <T> implements StackInterface <T> {
    T container[];
    int top;
    static int DEFAULT_SIZE = 10;


    public ArrayStackImplement(int initSize) {
        container = (T[]) new Object[initSize]; //Typecasts our object (highest order data type) to whatever data we input
        top = -1;
    }
    ArrayStackImplement(){
        this(DEFAULT_SIZE);
    }

    public void push(T itm) {
        container[++top] = itm;
    }

    public T getTop() {
        if (top == -1) {
            return null;
        } else {
            return container[top];
        }
    }

    public T pop() {
        if (top == -1)
            return null;
        T itm = container[top];
        container[top--] = null;
        return itm;
    }


    public T peek() {
        T itm = container[top];
        return itm;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return (top + 1);
    }


//When iterating object, use iterator

    public Iterator<T> iterator() {
        return new ArrayStackIterator();
    }

    class ArrayStackIterator implements Iterator<T> {
        int i = top;

        public boolean hasNext() {
            return (i > -1);
        } //Until top goes to -1, there are elements in container

        public T next() {
            return container[i--];
        }
    }

    public static void main(String[] args) {
        StackInterface<Integer> container = new ArrayStackImplement<Integer>();
        container.push(20);
        container.push(37);
        container.push(111);
        container.push(993);
        System.out.println("Size of container: " + container.size());
        for(Iterator <Integer> i = ((ArrayStackImplement<Integer>)container).iterator();i.hasNext(););
    }
}