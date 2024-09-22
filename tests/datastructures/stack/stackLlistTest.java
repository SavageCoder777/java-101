package tests.datastructures.stack;

import src.datastructures.stack.stackLlist;

public class stackLlistTest {
    public static void main(String[] args) {
        stackLlist test = new stackLlist();
        for (int i = 1; i <= 10; i++) {
            test.enqueue(i);
        }
        test.printStack();
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.size());
        test.printStack();
    }
}