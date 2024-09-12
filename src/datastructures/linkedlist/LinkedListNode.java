package src.datastructures.linkedlist;

public class LinkedListNode {
    private int value;
    private LinkedListNode next;
    private LinkedListNode previous;

    public LinkedListNode(int val) {
        this.value = val;
        this.next = null;
        this.previous = null;
    }

    public void setValue(int val) {
        this.value = val;
    }

    public int getValue() {
        return value;
    }
    
    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode node) {
        next = node;
    }

    public LinkedListNode getPrevious() {
        return previous;
    }

    public void setPrevious(LinkedListNode node) {
        previous = node;
    }

    public void printValue() {
        System.out.print(value + " ");
    }
}