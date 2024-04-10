package Apr10;


import java.util.PriorityQueue;

/**
    * Unlike a standard First-In-First-Out queue, PriorityQueue processes the queue items based on their priorities
    * By default, the priority is determined by the objects' natural ordering. Default priority can be overriden by a comparator provided at queue construction time
        **/
public class PriorityQueueIntro {
    public static void main(String[] args) {
        //Create PriorityQueue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        numbers.add(750);
        numbers.add(500);
        numbers.add(900);
        numbers.add(100);
        while(!numbers.isEmpty()){
            System.out.println(numbers.remove());
        }

    }

}
