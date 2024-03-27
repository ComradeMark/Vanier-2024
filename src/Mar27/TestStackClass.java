package Mar27;

import java.util.Stack;

public class TestStackClass {
//Usage of the pre existing library for stacks
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Vanier");
        s.add(23);
        s.add('b');
        System.out.println(s); //No need for generics!
        s.pop();
        s.push("balls");
        System.out.println(s); //No need for generics!


    }

}
