package Assignment2;
import java.util.*;
//Given a linked list of integers, write a java program to reverse the linked list.
public class Q6 {
    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(15);
        ll1.add(4);
        ll1.add(7);
        ll1.add(19);
        ll1.add(2);
        System.out.println("Initial LinkedList: ");
        viewLL(ll1);
        LinkedList<Integer> ll2 = reverseLL(ll1);
        System.out.println("\nReversed LinkedList: ");
        viewLL(ll2);


    }
    private static void viewLL(LinkedList<Integer> ll1){
        for(int i = 0; i<ll1.size();i++){
            if(i == ll1.size()-1){
                System.out.print(ll1.get(i));
            }
            else if (ll1.get(i)!=null){
                System.out.print(ll1.get(i) + "->");
            }
        }
    }
    private static LinkedList<Integer> reverseLL(LinkedList<Integer> ll1){
        LinkedList<Integer> ll2 = new LinkedList<>();

        Integer[] temp = new Integer[ll1.size()];
        ll1.toArray(temp);
        Collections.reverse(Arrays.asList(temp));
        for(int i = 0; i<ll1.size(); i++){
            ll2.add(temp[i]);
        }
return ll2;
    }
}
