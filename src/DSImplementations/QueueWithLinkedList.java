package DSImplementations;

public class QueueWithLinkedList {
    public static void main(String[] args) {
        MyLLQueue queue = new MyLLQueue();

        // Enqueue
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Peek
        System.out.println("Front: " + queue.peek());

        // Dequeue
        queue.dequeue();

        System.out.println("Front after dequeue: " + queue.peek());

        queue.dequeue();

        System.out.println("Front after dequeue: " + queue.peek());

        queue.dequeue();

        // Queue is now empty
        System.out.println("Front: " + queue.peek());

        // Try to dequeue from empty queue
        queue.dequeue();
    }
}

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class MyLLQueue{
    private Node front;
    private Node rear;
    private int currSize;
    MyLLQueue(){
        currSize = 0;
        this.front = this.rear = null;
    }

    public void enqueue(int val){
        Node newNode = new Node(val);
        if(isEmpty()){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
        currSize++;
    }

    private boolean isEmpty() {
        return (front == null);
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is in underFlow!!");
            return;
        }

        Node temp = front;
        front = front.next;
        if(front == null) rear = null;
        temp = null;

        currSize--;
    }

    public int peek(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.val;
    }

}

