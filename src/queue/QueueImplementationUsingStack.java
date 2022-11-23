package queue;

import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/description/
public class QueueImplementationUsingStack {
    public static void main(String[] args) {
        MyDummyQueue queue = new MyDummyQueue();
        queue.push(6);
        queue.push(10);
        int param_2 = queue.pop();
        int param_3 = queue.peek();
        boolean param_4 = queue.empty();

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
    }
}


class MyDummyQueue {

    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();

    public MyDummyQueue() {
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        if (!output.empty()) {
            return output.pop();
        } else {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek() {
        if (!output.empty()) {
            return output.peek();
        } else {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */