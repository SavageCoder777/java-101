package src.datastructures.stack;

import src.datastructures.linkedlist.LinkedListNode;

public class stackLlist {
    protected LinkedListNode head;
    protected LinkedListNode tail;
    protected LinkedListNode sizer;
    protected LinkedListNode printer;
    protected String toPrint;
    protected boolean run;
    protected int count;
    protected int temp;

    public stackLlist() {
        this.head = null;
        this.tail = null;
        this.sizer = null;
        this.toPrint = "" ;
        this.run = true;
        this.count = 0;
    }

    public void enqueue(int val) {
        LinkedListNode node = new LinkedListNode(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }

    public int dequeue() {
        temp = tail.getValue();
        tail.getPrevious().setNext(null);
        tail = tail.getPrevious();
        return temp;
    }

    public int size() {
        sizer = head;
        while (run) {
            count++;
            if (sizer.getNext() == null) {
                run = false;
            }
            sizer = sizer.getNext();
        }
        return count;
    }

    public void printStack() {
        printer = head;
        if (head == null) {
            System.out.print("No items in linked list");
        }
        while (printer != null) {
            printer.printValue();
            printer = printer.getNext();
        }
        System.out.println(" ");
    }
}