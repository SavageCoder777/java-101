package LinkedList;
import LinkedList1.LinkedListNode1;

public class LinkedList {
    protected LinkedListNode1 head;
    protected LinkedListNode1 tail;
    /* The following four LinkedListNode properties are
       used in the same way and can be condensed into
       just one if needed. */
    protected LinkedListNode1 printer;
    protected LinkedListNode1 deleter; 
    protected LinkedListNode1 sorter;
    protected LinkedListNode1 duplicate;
    protected boolean run;
    protected boolean test;
    protected boolean sorted;
    protected boolean fort;
    protected int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.printer = null;
        this.deleter = null;
        this.sorter = null;
        this.sorted = false;
        this.fort = false;
    }

    public LinkedList(boolean sorted, boolean fort) {
        this.sorted = sorted;
        this.fort = fort;
    }

    public void add(int val) {
        test = true;
        LinkedListNode1 node = new LinkedListNode1(val);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            if (sorted == true && fort == true) {
                test = noAddingDuplicates(node, test);
                if (test) {
                    sortLinkedList(node);
                }
            } else if (sorted == true && fort == false) {
                sortLinkedList(node);
            } else {
                if (sorted == false && fort == true) {
                    test = noAddingDuplicates(node, test);
                }
                if (test) {
                    tail.setNext(node);
                    node.setPrevious(tail);
                    tail = node;
                }
            }
        }
    }

    public void delete(int valueToDelete) {
        deleter = head;
        while (deleter != null) {
            if (deleter.getValue() == valueToDelete) {
                deleter.getPrevious().setNext(deleter.getNext());
            }
            deleter = deleter.getNext();
        }
    }

    public void printLinkedList() {
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

    public void sortLinkedList(LinkedListNode1 oneToAdd) {
        sorter = head;
        run = true;
        count = 0;
        while (run) {
            if (oneToAdd.getValue() <= head.getValue()) {    
                oneToAdd.setPrevious(null);
                head.setPrevious(oneToAdd);
                oneToAdd.setNext(head);
                head = oneToAdd;
                run = false;
                count = 2;
            } 
            sorter = sorter.getNext();
            if (sorter == null) {
                if (oneToAdd.getValue() >= tail.getValue()) {
                    tail.setNext(oneToAdd);
                    oneToAdd.setPrevious(tail);
                    tail = oneToAdd;
                }
                run = false;
            }
            if (run) {
                if (count != 2) {
                    if (oneToAdd.getValue() <= sorter.getValue()) {
                        oneToAdd.setPrevious(sorter.getPrevious());
                        sorter.getPrevious().setNext(oneToAdd);
                        oneToAdd.setNext(sorter);
                        sorter.setPrevious(oneToAdd);
                        run = false;
                    }
                }
            }
        }
    }
    
    public boolean noAddingDuplicates(LinkedListNode1 toCheck, boolean run) {
        duplicate = head;
        while (duplicate != null) {
            if (toCheck.getValue() == duplicate.getValue()) {
                run = false;
            }
            duplicate = duplicate.getNext();
        }
        return run;
    }
}