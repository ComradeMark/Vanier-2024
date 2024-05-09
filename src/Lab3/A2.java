package Lab3;
import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Scanner;
//Write a Java program to get all the element in a tree set which is
//greater than and less than to the given element.
public class A2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        TreeSet<Integer> ints = new TreeSet<>();
        ints.add(114);
        ints.add(22);
        ints.add(867);
        ints.add(4);
        ints.add(77);
        ints.add(45);
        TreeSet<Integer> bigger = new TreeSet<>();

        System.out.println("Input cutoff number");
        int choice = input.nextInt();
        Iterator<Integer> iterator = ints.iterator();
        //Iterating through the collection using our iterator
        while(iterator.hasNext()){
            int number = iterator.next();
            if(number > choice){
                bigger.add(number);
                iterator.remove(); //removes Number from the collection.
            }
        }
        System.out.println("Numbers smaller than " + choice + ints);
        System.out.println("Numbers bigger than " + choice + bigger);
    }
}




