package tests.recursion;

import src.recursion.loop;
import src.recursion.recursion;

public class timeTest {
    double averageLoop;
    double averageRecursion;
    double time;
    double timeTwo;
    double times;

    public timeTest() {
        averageLoop = 0;
        averageRecursion = 0;
        time = 0;
        times = 1000;
    }

    public void test() {
        loop testLoop = new loop();
        recursion testRecursion = new recursion();
        averageLoop = 0;
        averageRecursion = 0;
        int temp = (int) times;

        for (int rep = 1; rep <= times; rep++) {
            time = System.currentTimeMillis();
            for (int count = 1; count <= times; count++) {
                testLoop.reverseSum(temp);
            } timeTwo = System.currentTimeMillis();
            timeTwo -= time;
            timeTwo /= times;
            averageLoop += timeTwo;
        } averageLoop /= times;
        
        time = 0;
        timeTwo = 0;

        for (int rep = 1; rep <= times; rep++) {
            time = System.currentTimeMillis();
            for (int count = 1; count <= times; count++) {
                testRecursion.reverseSum(temp);
            } timeTwo = System.currentTimeMillis();
            timeTwo -= time;
            timeTwo /= times;
            averageRecursion += timeTwo;
        } averageRecursion /= times;

        System.out.println("Average Loop: " + averageLoop);
        System.out.println("Average Recursion: " + averageRecursion);
        System.out.println("Recursion is approximately " + (averageRecursion - averageLoop) + " milliseconds slower than loops.");
    }

    public static void main(String[] args) {
        timeTest trial = new timeTest();
        trial.test();
    }

}