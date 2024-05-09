package Assignment2;


// Given a queue of integers of even length, shift the first half of the elements with the other
//halves. Stack/Queue can be used as an auxiliary space.
//Sample Input: [6, 5, 2, 3, 1, 3, 2, 1]
//Output: [1, 3, 2, 1, 6, 5, 2, 3]

import java.util.LinkedList;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(6);
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();
        int halfSize = size / 2;
        for (int i = 0; i < halfSize; i++) {
            stack.push(queue.remove());
        }
        for (int i = 0; i < size - halfSize; i++) {
            queue.add(queue.remove());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}
