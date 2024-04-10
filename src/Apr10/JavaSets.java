package Apr10;

/***
 A set refers to a collection that cannot contain duplicate elements
 It is mainly used to model mathematical set abstraction
 Set is implemented in various classes: HashSet; LinkedHashSet; TreeSet
 **/
/**
 In a HashSet, elements are randomly displayed. Use LinkedHashSet to control order in which elements are displayed
 **/

import java.util.*;

public class JavaSets {
    public static void main(String[] args) {


        //Initial operation with HashSet
        doHashSetOperation();

        //Same operation with LinkedHashSet
        doLinkedSetOperation();

        //Same operation with TreeSet
        doTreeSetOperation();

    }
    static void doHashSetOperation(){
        //HashSet creation
        HashSet<String> set1 = new HashSet();


        set1.add("John");
        set1.add("Jennie");
        set1.add("John"); //Although John is added twice, John will only be stored once
        set1.add("Jim");
        set1.add("Joe");
        set1.add("john");

        //Due to Hashing, data is unordered
        System.out.println("Set is: " + set1);

        Iterator<String> itr = set1.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        //Remove element
        set1.remove("Jim");
        System.out.println("Set after removing Jim is: " + set1);

        //Check is set contains something
        if(set1.contains("John")){
            System.out.println("John is in the set");
        }
        //Check set size
        System.out.println("Set size is: " + set1.size());

    }
    static void doLinkedSetOperation(){
        //LinkedHashSet maintains insertion order
        System.out.println("\n\n Set 2 operations: \n");
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("BMW");
        set2.add("Honda");
        set2.add("Audi");
        set2.add("Toyota");
        set2.add("BMW");
        set2.add("Nissan");

        //Due to Hashing, data is unordered
        System.out.println("Set2 is: " + set2);

        Iterator<String> itr = set2.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }

        //Remove element
        set2.remove("BMW");
        System.out.println("Set2 after removing BMW is: " + set2);

        //Check is set contains something
        if(set2.contains("Nissan")){
            System.out.println("Nissan is in the set Set2");
        }
        //Check set size
        System.out.println("Set2 size is: " + set2.size());

    }

    static void doTreeSetOperation(){
        //TreeSet stores values in ascending order
        TreeSet<String> set3 = new TreeSet<>();


    }

}
