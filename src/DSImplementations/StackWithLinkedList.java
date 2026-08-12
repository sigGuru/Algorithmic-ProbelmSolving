package DSImplementations;

public class StackWithLinkedList {
    public static void main(String[] args) {

        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());

        // Peek
        System.out.println("Top element: " + stack.peek());

        // Pop
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Peek again
        System.out.println("Top element after pop: " + stack.peek());

        // Size
        System.out.println("Stack size: " + stack.size());

        // Check empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Pop remaining element
        System.out.println("Popped: " + stack.pop());

        // Check empty again
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Try popping from empty stack
        System.out.println("Popped: " + stack.pop());
    }
}

class MyStack{
    Node top;
    int count;
    MyStack(){
        top = null;
        count = 0;
    }

    public void push(int val) {
        Node newNode = new Node(val);

        newNode.next = top;
        top = newNode;
        count++;
    }

    public int pop(){

        if(top == null){
            System.out.println("Stack is Empty!!!");
            return -1;
        }

        Node temp = top;
        top = top.next;

        int val = temp.val;
        count--;
        return val;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is Empty!!");
            return -1;
        }

        return top.val;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return count;
    }

}

