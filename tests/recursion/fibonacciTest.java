package tests.recursion;

import src.recursion.fibonacci;

public class fibonacciTest {
    public static void main(String[] args) {
        fibonacci test = new fibonacci();

        for (int count = 1; count <= 10; count++) {
            System.out.print("Fibonnaci sequence of " + count + " elements: ");
            test.printFibonnaci(count, 1);
            System.out.println();
        }
    }
}
