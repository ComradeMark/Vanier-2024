package Lab3;
// In a provided linked list, remove the node that is second from the
//tail (the penultimate node), without utilizing any pre-defined methods.
//Implement the logic independently.
//Input: 3 – 5 – 5 – 6 – 78 – 7 – 44 - 9
//Output: 3 – 5 – 5 – 6 – 78 – 7 – 9
import java.util.*;
public class A7 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.viewLL();
        ll.insertAtMiddle(3, 1);
        ll.viewLL();
        ll.insertAtMiddle(5, 2);
        ll.viewLL();
        ll.insertAtMiddle(5, 3);
        ll.viewLL();
        ll.insertAtMiddle(6, 4);
        ll.viewLL();

        ll.insertAtMiddle(78, 5);
        ll.viewLL();

        ll.insertAtMiddle(7, 6);
        ll.insertAtMiddle(44, 7);
        ll.insertAtMiddle(9, 8);
        ll.viewLL();



        ll.deleteAtPosition(ll.getSizeOfList()-1);
        ll.viewLL();




    }
}

class Node {
    private int data;
    private Node next;

    public Node() {
        data = 0;
        next = null;
    }

    public Node(int d, Node n) {
        data = d;
        next = n;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}

class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;

    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    public int getSizeOfList() {
        return size;

    }

    //Implement insertion operation
    //1. insertion at head (first)
    public void insertAtFirst(int val) {
        Node n;
        n = new Node();
        n.setData(val);
        n.setNext(head); //The element after our new node is the previous head
        head = n;
        size++;//New node becomes head
    }

    //Implement insertion at LAST

    public void insertAtLast(int val) {
        Node n, t;
        n = new Node();
        n.setData(val);

        //Local pointer used to traverse our linked list
        t = head; //We use t in order to maintain head at the same position (ref of head becomes a local variable)
        if (t == head) {
            head = n;
        } else {
            //We must first find last node (traversal)
            while (t.getNext() != null) {
                t = t.getNext();
                //last node . next becomes new node
                // new node . next becomes null
            }
            t.setNext(n);

        }
        size++; //Size must be incremented

    }

    //Insert node at a given position
    public void insertAtMiddle(int val, int pos) {
        if (pos == 1) {
            insertAtFirst(val);
        } else if (pos == size + 1) {
            insertAtLast(val);
        } else if (pos > 1 && pos <= size) {
            Node n, t;
            n = new Node(val, null);
            t = head;
            //Traverse until position - 1
            for (int i = 1; i < pos - 1; i++) {
                t = t.getNext();
                n.setNext(t.getNext());
                t.setNext(n);
                size++;
            }
        } else System.out.println("It is impossible to insert at given position!");
    }

    //Deletion operation
    public void deleteFirst() {
        //Delete at first (head)
        if (head == null) {
            System.out.println("Not going through operation. Head is empty.");

        } else {
            head = head.getNext();
            size--;
        }
    }

    //Delete at last
    public void deleteAtLast() {

        if (head == null) {
            System.out.println("LL empty");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            Node t;
            t = head;
            for (int i = 1; i < size - 1; i++) {
                t = t.getNext();
                t.setNext(null);
                size--;
            }


        }

    }

    //Delete at a given position
    public void deleteAtPosition(int val) {
        Node t, t1;
        if (head == null) {
            System.out.println("Empty.");
        } else if (val == 1) {

            deleteFirst();
        } else if (val == size) {
            deleteAtLast();
        } else {
            t = head;
            for (int i = 1; i < val - 1; i++) {
                t = t.getNext();
            }
            t1 = t.getNext(); //t1 will store position of node's next address
            t.setNext(t1.getNext()); //node t will now point to the node after the deleted one
            size--;
        }
    }

    public int foundNode(int key) {
        Node current;
        current = head;
        int position = 1;
        while (current != null) {
            if (current.getData() == key) {
                return position;
            }
            current = current.getNext();
            position++;


        }
        return -1;
    }

    public void viewLL() {
        Node r;
        if (isEmpty()) {
            System.out.println("LL Empty");
        } else {
            r = head;
            for (int i = 0; i < size; i++) {
                System.out.print(r.getData() + " -> ");
                r.getNext();
            }
            System.out.println();
        }
    }

}