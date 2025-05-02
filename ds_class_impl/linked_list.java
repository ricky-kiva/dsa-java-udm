package ds_class_impl;

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

    public void remove(int data) {
        // if Linked List is empty 
        if (head == null) {
            return;
        }

        // if want to remove the first node
        if (head.data == data) {
            head = head.next;

            // if after removing the first node, there's no element
            if (head == null) {
                tail = null;
            }

            return;
        }

        // if want to remove node after the first node
        Node current = head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;

                // if after removing the node, the last node points to null
                if (current.next == null) {
                    tail = current;
                }

                return;
            }

            current = current.next;
        }
    }
}
