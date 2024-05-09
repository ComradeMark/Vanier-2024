package Lab3;
import java.util.*;
 //Write a Java program to add all the elements which is divisible
 //    by both 3 and 5 of a priority queue to another priority queue.
public class A3 {
     public static void main(String[] args) {
         PriorityQueue<Integer> init = new PriorityQueue<>();
         init.add(50);
         init.add(15);
         init.add(30);
         init.add(24);
         init.add(17);
         init.add(99);
         PriorityQueue<Integer> divs = new PriorityQueue<>();

         while(!init.isEmpty()){
            int temp = init.remove();
            if(temp %3 == 0 && temp % 5 == 0){
                divs.add(temp);
            }
        }
         System.out.println("Numbers divisble by both 5 and 3: " + divs);

     }
 }


