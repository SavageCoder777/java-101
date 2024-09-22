package tests.datastructures.queue;

import src.datastructures.queue.queueArray;

public class queueArrayTest {
    
    public static void main(String[] args) {
        queueArray test = new queueArray(10);
        for (int i = 1; i <= 10; i++) {
            test.enqueue(i);
        }
        test.printQueue();
        System.out.println(test.dequeue());
        System.out.println(test.dequeue());
        System.out.println(test.size());
        test.printQueue();
    }
}