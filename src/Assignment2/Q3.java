package Assignment2;
// Create a random queue using java array. For example, the queued items are 44, 122, -4, 10,0,99.
// Now, by using only queue operations such as enqueue and dequeue, do you think sorting is possible?
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(44);
        queue.add(122);
        queue.add(-4);
        queue.add(10);
        queue.add(0);
        queue.add(99);

        List<Integer> tempList = new ArrayList<>();
    while(!queue.isEmpty()){
        tempList.add(queue.remove());
    }
    Collections.sort(tempList);
    for(int num : tempList){
        queue.add(num);
    }
        System.out.println(queue);
    }
}