package DSImplementations;

import java.util.Scanner;

public class StackWithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Mystack stack = new Mystack(n);

        for(int i =0; i < n; i++){
            stack.push(sc.nextInt());
        }

        printStack(stack);
        System.out.println();
        System.out.println("is Full :" + stack.isFull());

        System.out.println("Poped element :" + stack.pop());

        System.out.println("Top element : " + stack.top());
        System.out.println("is Empty : " + stack.isEmpty());
        System.out.println("is Full : "+stack.isFull());
    }

    private static void printStack(Mystack stack) {
        for(int i = stack.top; i >= 0; i--){
            System.out.print(stack.arr[i] + " ");
        }
    }
}

class Mystack{
    int[] arr;
    int top;
    int capacity;

    Mystack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int val){
        if(top == capacity - 1){
            System.out.println("The stack is Full!!");
        }

        arr[++top] = val;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty!!");
        }

        return arr[top--];
    }

    public int top(){
        if(top == -1){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

}
