package Apr10;

import java.util.PriorityQueue;

public class PriorityQueueSort {
    public static void main(String[] args) {
        PriorityQueue<String> namePriorityQueue = new PriorityQueue<>();
        namePriorityQueue.add("Lisa");
        namePriorityQueue.add("Robert");
        namePriorityQueue.add("Chris");
        namePriorityQueue.add("Angelina");
        namePriorityQueue.add("Joe");
        namePriorityQueue.add("Robert");
        while(!namePriorityQueue.isEmpty()){
            System.out.println(namePriorityQueue.remove()); //Dequeues in natural order
        }





    }
}
