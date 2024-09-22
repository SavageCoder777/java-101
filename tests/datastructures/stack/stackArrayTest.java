package tests.datastructures.stack;

import src.datastructures.stack.stackArray;

public class stackArrayTest {
    public static void main(String[] args) {
        stackArray test = new stackArray(10);
        for (int i = 1; i <= 10; i++) {
            test.push(i);
        }
        test.printStack();
        System.out.println(test.pop());
        System.out.println(test.pop());
        System.out.println(test.size());
        test.printStack();
    }
}