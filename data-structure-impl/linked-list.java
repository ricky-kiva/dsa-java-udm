class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = 0;
        this.next = null;
    }
}

class LinkedList {
    // clarification: head & tail CONTAINS `data`
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head.next = newNode;
            tail.next = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head.next = newNode;
            tail.next = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}
