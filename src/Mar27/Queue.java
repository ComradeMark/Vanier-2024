package Mar27;

//Queues are a collection whose elements are added at one end (the tail of queue) and removed from the front(head) of the queue
//FIFO (first in first out) data structure
//Useful for encoding messages

public class Queue {

    //enqueue - add element to tail
    //dequeue - remove element from head
    //first - examine first element

    int front, rear, capacity;
    int queue[];
    Queue(int c){
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }
//Implement enqueue in which we add the element at the read end
    void enqueue(int data){
        if(capacity == rear){
            System.out.println("Queue is full");
        }
        else{
            queue[rear] = data;
            rear++;
        }


    }
//Implement dequeue in which the front element is removed
    void dequeue(){
        if(front == rear){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = 0; i<rear - 1; i++){
                queue[i] = queue[i+1];
            }
        }
        if(rear < capacity){
            queue[rear] = 0;
            rear--;
        }
    }
    void print(){
        int i;
        System.out.println("\nElements are: ");
        for(i = front; i<rear; i++){
            System.out.print(queue[i] + " ");

        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(10);
        q.enqueue(25);
        q.enqueue(31);
        q.enqueue(14);
        q.enqueue(26);
        q.print();
        q.dequeue();
        q.print();
        


    }
}
