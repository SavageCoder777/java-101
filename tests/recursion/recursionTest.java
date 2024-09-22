package tests.recursion;

import src.recursion.recursion;

public class recursionTest {
    public static void main(String[] args) {
        recursion test = new recursion();
        System.out.println(test.reverseSum(10));
        System.out.println(test.forwardSum(1, 10));
        System.out.println(test.reverseFactorial(10));
    }
}
