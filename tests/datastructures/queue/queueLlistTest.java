package tests.datastructures.queue;

import src.datastructures.queue.queueLlist;

public class queueLlistTest {
    
    public static void main(String[] args) {
        queueLlist test = new queueLlist();
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