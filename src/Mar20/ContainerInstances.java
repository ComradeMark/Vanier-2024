package Mar20;
import java.util.*;
class Container<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends Number> obj) {

    }
}
public class ContainerInstances{
    public static void main(String[] args) {

        Container<Integer> obj = new Container<Integer>();
        obj.value = 0;
        obj.show();
        obj.demo(new ArrayList<Number>());
    }
}
