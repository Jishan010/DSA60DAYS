package linkedlist;

class MyLinkedList {

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * Initialize your data structure here.
     */
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        Node node = head;
        int i = 0;
        while (i < index) {
            node = node.next;
            i++;
        }
        return node.value;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            addAtHead(val);
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }

        int i = 1;
        Node temp = head;
        while (temp.next != null && i < index) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        if (index == 0) {
            deleteAtHead();
            return;
        }
        Node node = head;
        int i = 1;
        while (null != node && i < index) {
            node = node.next;
            i++;
        }

        node.next = node.next.next;
        if (node.next == null) {
            tail = node;
        }
        size--;
    }

    public void deleteAtHead() {
        head = head.next;
        size--;
    }
}
