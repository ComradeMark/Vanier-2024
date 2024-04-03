package Apr03;

import java.util.*;

public class IteratorDemo2 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List <Double> list2 = new LinkedList<Double>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Double> set2 = new TreeSet<Double>();

        //Arraylist fill 10 integers from 1 to 10
        for(int i = 0; i<10; i++){
            list1.add((int) (Math.random() *10)+1);
        }
        //Linkedlist fill 10 doubles 0 - 0.99
        for(int i = 0; i<10; i++){
            list2.add((int) (Math.random() *100)/100.0);
        }
        //Hashset fill
        for(int i = 0; i<10; i++){
            set1.add((int) (Math.random() * 10)+1);
        }
        //Treeset fill
        for(int i = 0; i<10; i++){
            set2.add((int) (Math.random() * 100)/100.0);

        }

        //Use of 4 iterators to display our various random values

        Iterator <Integer> here1 = list1.iterator(); //ArrayList iterator
        Iterator<Double> here2 = list2.iterator(); //LinkedList iterator
        Iterator<Integer> here3 = set1.iterator(); //HashSet iterator
        Iterator<Double> here4 = set2.iterator(); //TreeSet iterator

        System.out.println("Arraylist: ");
        while(here1.hasNext()){
            System.out.println(here1.next() + " ");
        }
        System.out.println("\n\nLinkedList");
        while(here2.hasNext()){
            System.out.println(here2.next());
        }
        System.out.println("Hashset: ");
        while(here3.hasNext()){
            System.out.println(here3.next() + " ");
        }
        System.out.println("\n\nTreeset");
        while(here4.hasNext()){
            System.out.println(here4.next());
        }

        //Other way of iterating:
        System.out.println("Other way: ");
        for(Iterator<Integer> i = list1.iterator(); i.hasNext();){
            System.out.println(i.next() + " ");
        }
    }
}
