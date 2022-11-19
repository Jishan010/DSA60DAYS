package queue;

public class QueueImplementation {

    //krishnendu solved it very good from tutort class

    public static void main(String[] args) {
        int[] array = new int[5];
        Queue queue = new Queue(array);
        queue.insertAtRear(1);
        queue.insertAtRear(2);
        queue.insertAtRear(3);
        queue.insertAtRear(4);
        queue.insertAtRear(5);

        System.out.println(queue.getFront());
        queue.removeFromFront();
        queue.removeFromFront();
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();
        System.out.println(queue.isEmpty());



    }
}

class Queue {

    int[] array;
    int front = -1;
    int rear = -1;

    Queue(int[] array) {
        this.array = array;
    }

    //insert to rear
    public void insertAtRear(int element) {
        if (front == -1) {
            array[++front] = element;
            rear++;
        } else {
            array[++rear] = element;
        }
    }

    //remove from front
    public int removeFromFront() {
        return array[front++];
    }

    public int getFront() {
        return array[front];
    }

    //check if queue is empty
    public boolean isEmpty() {
        return rear - front + 1 == 0;
    }

    public int size() {
        return rear - front + 1;
    }


}
