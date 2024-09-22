package tests.recursion;

import src.recursion.loop;

public class loopTest {
    public static void main(String[] args) {
        loop test = new loop();
        System.out.println(test.reverseSum(10));
        System.out.println(test.forwardSum(1, 10));
        System.out.println(test.reverseFactorial(10));
    }
}
