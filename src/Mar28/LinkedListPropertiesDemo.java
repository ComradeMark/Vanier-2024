package Mar28;
import java.util.Scanner;
/*
public class LinkedListPropertiesDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        boolean flag = false;
        System.out.println("Welcome. Select desired option: ");
        while (flag) {
            System.out.println("1 - Show size of list\n2 - Insert at first position\n3 - Insert at last position\n4 - Insert at a specific index\n5 - Delete first position\n6 - Delete at last position\n7 - Delete at a specific position\n8 - Search for a node value\n9 - Display list");
            Scanner input = new Scanner(System.in);
            Character choice = input.nextLine().charAt(0);
            switch (choice) {
                case 1:list.getSizeOfList();
                case 2:
                    System.out.println("What would you like to insert?");
                    int value = input.nextInt();
                    list.insertAtFirst(value);
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:

            }
        }
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
            head = n; //New node becomes head
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
            }
        }

    }
*/