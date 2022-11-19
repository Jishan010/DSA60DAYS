package queue;

 class MyQueue {

    private int arr[];
    private int front;
    private int rear;

    public MyQueue(int size) {
        this.arr = new int[size];
        this.front = this.rear = -1;
    }

    public void insertAtRear(int key) {
        if (this.rear == arr.length - 1)
            System.out.println("Queue overflow...can't insert");
        else {
            arr[++rear] = key;
            if (front == -1)
                ++front;
        }
    }

    public int deleteAtBegin() {
        if (this.front == -1)
            throw new IllegalStateException("Queue underflow nothing to delete");
        int val = arr[front++];

        if (front > rear) {
            front = rear = -1;
        }
        return val;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public int size() {
        if (front != -1 && rear != -1) {
            return rear - front + 1;
        }
        return 0;
    }

     /**
      * void enqueue(int element)
      * {
      *     if(front==-1 && rear==-1)   // condition to check queue is empty
      *     {
      *         front=0;
      *         rear=0;
      *         queue[rear]=element;
      *     }
      *     else if((rear+1)%max==front)  // condition to check queue is full
      *     {
      *         printf("Queue is overflow..");
      *     }
      *     else
      *     {
      *         rear=(rear+1)%max;       // rear is incremented
      *         queue[rear]=element;     // assigning a value to the queue at the rear position.
      *     }
      * }
      */

     /**
      * int dequeue()
      * {
      *     if((front==-1) && (rear==-1))  // condition to check queue is empty
      *     {
      *         printf("\nQueue is underflow..");
      *     }
      *  else if(front==rear)
      * {
      *    printf("\nThe dequeued element is %d", queue[front]);
      *    front=-1;
      *    rear=-1;
      * }
      * else
      * {
      *     printf("\nThe dequeued element is %d", queue[front]);
      *    front=(front+1)%max;
      * }
      * }
      */

     /**
      * void display()
      * {
      *     int i=front;
      *     if(front==-1 && rear==-1)
      *     {
      *         printf("\n Queue is empty..");
      *     }
      *     else
      *     {
      *         printf("\nElements in a Queue are :");
      *         while(i<=rear)
      *         {
      *             printf("%d,", queue[i]);
      *             i=(i+1)%max;
      *         }
      *     }
      * }
      */
 }
