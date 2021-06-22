package dataStructures;

import dataStructures.utility.Node;

public class Deque {
    Node head=null,tail=null;

    void addFirst(int data) {
        Node n = createNode(data);
        if(head == null) {
            n.next = null;
            n.prev = null;

            head=tail=n;
        }
        n.next = head;
        head.prev = n;

        n.prev = null;
        head = n;
    }

    void addLast(int data) {
        Node n = createNode(data);
        if(head == null) {
            n.next = null;
            n.prev = null;

            head=tail=n;
        }
        n.next = null;
        n.prev = tail;
        tail.next = n;
        tail = n;
    }

    int removeFirst() {
        if(head==null) {
            return Integer.MIN_VALUE;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        return data;
    }

    int removeLast() {
        if(head==null) {
            return Integer.MIN_VALUE;
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        return data;
    }

    void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    private Node createNode(int data) {
        return new Node(data);
    }

    public static void main(String[] args) {
        Deque d = new Deque();
        d.addFirst(2);
        d.addLast(3);
        d.addFirst(1);

        d.display();

        d.removeFirst();

        d.display();

        d.removeLast();

        d.display();
    }
}
