package Assignment2;
// Create a random queue using java array. For example, the queued items are 44, 122, -4, 10,0,99.
// Now, by using only queue operations such as enqueue and dequeue, do you think sorting is possible?
import java.util.*;
public class Q3 {
    public static void main(String[] args) {


        Queue<Integer> rand = new LinkedList<>();
        rand.add(44);
        rand.add(122);
        rand.add(-4);
        rand.add(10);
        rand.add(0);
        rand.add(99);
        Queue<Integer> sortedQueue = sortQueue(rand);
        while (!sortedQueue.isEmpty()) {
            System.out.println(sortedQueue.poll());
        }
    }


    public static Queue<Integer> sortQueue(Queue<Integer> initial) {
        Queue<Integer> sorted = new LinkedList<>();
        while (!initial.isEmpty()) {
            int temp = initial.poll();
                if (sorted.peek() > temp) {

                    sorted.add(temp);
                }

        }
        return sorted;
    }
}