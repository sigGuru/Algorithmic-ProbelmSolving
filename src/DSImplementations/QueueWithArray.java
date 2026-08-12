package DSImplementations;

import java.util.Scanner;

public class QueueWithArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int capacity = sc.nextInt();

        MyQueue queue = new MyQueue(capacity);

        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
        queue.enqueue(sc.nextInt());
//        queue.enqueue(sc.nextInt());

        queue.dequeue();

        printQueue(queue);

        System.out.println( "peek : "+ queue.peek());
        System.out.println( "Rear :" + queue.getRear());
        System.out.println( "isEmpty :" + queue.isEmpty());
        System.out.println( "is Full :" + queue.isFull());
    }

    private static void printQueue(MyQueue queue) {
        for(int i = 0; i < queue.size; i++){
            System.out.print(queue.arr[i] + " ");
        }
    }
}

class MyQueue{
    int[] arr;
    int capacity;
    int size;

    public MyQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];

        size = 0;
    }

    public void enqueue(int val){
        if(size < capacity){
            arr[size] = val;
            size++;
        }
        else{
            System.out.println("Queue is Full!!");
            return;
        }
    }

    public void dequeue(){
        if(size == 0){
            System.out.println("Queue is Empty!!");
            return;
        }

        for(int i = 1; i < size; i++){
            arr[i-1] = arr[i];
        }
        size--;
    }

    public int peek(){
        if(size == 0){
            System.out.println("Queue is Empty !!");
            return -1;
        }
        return arr[0];
    }

    public int getRear(){
        if(size == 0){
            System.out.println("Queue is Empty !!");
            return -1;
        }
        return arr[size - 1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }
}
