package me.karunarathne.ExpressionBalancing;

public class CharQueue {
    private Node firstNode;
    private Node lastNode;
    private int size;

    public CharQueue() {
        size = 0;
    }

    public Character dequeue() {
        if (size == 0) {
            return null;
        }
        char temp = firstNode.data;
        if (size == 1) {
            firstNode = null;
        } else {
            firstNode.next.prev = null;
            firstNode = firstNode.next;
        }

        size -- ;
        return temp;
    }

    public void enqueue(char character) {
        if (size == 0) {
            firstNode = new Node(character);
            lastNode = firstNode;
        } else if (size == 1) {
            lastNode = new Node(character, firstNode);
            firstNode.next = lastNode;
        } else {
            lastNode = new Node(character, lastNode);
            lastNode.prev.next = lastNode;
        }

        size ++ ;
    }

    public void clear() {
        size = 0;
        firstNode = null;
        lastNode = null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node {
        char data;
        Node next;
        Node prev;

        public Node(char data) {
            this.data = data;
        }

        public Node(char data, Node prev) {
            this.data = data;
            this.prev = prev;
            prev.next = this;
        }
    }
}
