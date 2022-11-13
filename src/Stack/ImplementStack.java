package Stack;

import java.util.Stack;

public class ImplementStack {

    public static void main(String[] args) {
        int[] arr = new int[5];
        MyStack myStack = new MyStack(arr);

        myStack.push(3);
        myStack.push(2);
        myStack.push(6);
        myStack.push(8);
        myStack.push(9);

        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.peek());
    }




}

//stack implementation using array
class MyStack {

    int[] arr;
    int size = 0;
    int top = -1;

    MyStack(int[] arr) {
        this.arr = arr;
    }

    public void push(int element) {
        arr[++top] = element;
        size++;
    }

    public int pop() {
        int lastAddedValue = arr[top--];
        size--;
        return lastAddedValue;
    }

    public int peek() {
        return arr[top];
    }
}