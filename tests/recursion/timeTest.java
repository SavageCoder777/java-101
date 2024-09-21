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
        times = 500;
    }

    public void test() {
        loop testLoop = new loop();
        recursion testRecursion = new recursion();
        averageLoop = 0;
        averageRecursion = 0;

        for (int rep = 1; rep <= times; rep++) {
            time = System.currentTimeMillis();
            System.out.println(time);
            for (int count = 1; count <= times; count++) {
                testLoop.reverseSum(times);
            } time = (System.currentTimeMillis() - time) / times;
            averageLoop += time;
            System.out.print(averageLoop + ", ");
        } averageLoop /= times;
        System.out.println();

        // for (int rep = 1; rep <= times; rep++) {
        //     time = System.currentTimeMillis();
        //     for (int count = 1; count <= times; count++) {
        //         testRecursion.reverseSum(times);
        //     } time = (System.currentTimeMillis() - time) / times;
        //     averageRecursion += times;
        //     System.out.print(averageRecursion + ", ");
        // } averageRecursion /= times;
        // System.out.println();

        // System.out.println("Average Loop: " + averageLoop);
        // System.out.println("Average Recursion: " + averageRecursion);
    }

    public static void main(String[] args) {
        timeTest trial = new timeTest();
        trial.test();
    }

}