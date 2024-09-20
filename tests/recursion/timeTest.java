package tests.recursion;

import src.recursion.loop;
import src.recursion.recursion;

public class timeTest {
    int averageLoop;
    int averageRecursion;
    long time;
    int times;

    public timeTest() {
        averageLoop = 0;
        averageRecursion = 0;
        time = 0;
        times = 50;
    }

    public void test() {
        loop testLoop = new loop();
        recursion testRecursion = new recursion();
        averageLoop = 0;
        averageRecursion = 0;

        for (int rep = 1; rep <= 100; rep++) {
            time = System.currentTimeMillis();
            testLoop.reverseSum(times);
            time = (System.currentTimeMillis() - time);
            averageLoop += time;
        } averageLoop /= times;

        for (int rep = 1; rep <= 100; rep++) {
            time = System.currentTimeMillis();
            testRecursion.reverseSum(times);
            time = (System.currentTimeMillis() - time);
            averageRecursion += time;
        } averageRecursion /= times;

        System.out.println("Average Loop: " + averageLoop);
        System.out.println("Average Recursion: " + averageRecursion);
    }

    public static void main(String[] args) {
        timeTest trial = new timeTest();
        trial.test();
    }

}
