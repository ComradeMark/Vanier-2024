package Mar27;

//ADT = Abstract Data Type

public class StackADT {

//Stack = a collection whose elements are added and removed from one end, called the top of the Stack
//Stack is a LIFO (Last in, first out) data structure
//It is not legal to access any element than the one at the top of the stack
    //Operations: push, pop, peek, isEmpty, size, toString

    int size; //Helps you assign the size of the container
    int arr[];
    int top; //Our only variable we will manipulate (top of container)

    public StackADT(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1; //When we want to add an element, we start from the zero index, so we use -1 (new element automatically inherits 0)

    }


    public void push(int pushedElement) {
        if (!isFull()) {
            top++; //Counter incremented if array isn't full
            arr[top] = pushedElement;
            System.out.println(" Pushed element is " + pushedElement);
        } else {
            System.out.println("Stack is full, you cannot add more");

        }

    }

    //Implement POP method
    public int pop() {
        //For robustness
        if (!isEmpty()) {
            int returnedElement = top;
            top--; //It is mandatory to decrement the container after every operation
            System.out.println("Removed Element " + arr[returnedElement]);
        } else {
            System.out.println("Stack is empty. Nothing to remove.");
        }
        return -1; //Expecting to start with -1, so we return -1

    }

    public boolean isEmpty() {
        return (top == -1); //If top is -1 that means container is empty
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public void printElements() {

        if (!isEmpty()) {
            System.out.println("Stack elements are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);

            }
        } else {
            System.out.println("It is void.");
        }

    }
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("it is void.");


        }
        return -1;
    }

    public static void main(String[] args) {
        //Create instance for the class
        StackADT container = new StackADT(10);
        container.pop();
        container.push(100);
        container.push(69);
        container.push(22);
        container.push(984);
        container.push(226);
        container.printElements();
        container.pop(); //Removes top element
        container.printElements();
        System.out.println("Top currently is: " + container.peek()); //Shows what is the top of the container at the moment
    }

}




