package src.recursion;

public class fibonacci {
    
    public static int nfibonacci(int until) {
        if (until == 1) {
            return (0);
        } if (until == 2) {
            return (1);
        } return nfibonacci(until - 1) + nfibonacci(until - 2);
    }

    public static void printFibonnaci(int numTerms, int whichTerm) {
        if (whichTerm < numTerms) {
            System.out.print(nfibonacci(whichTerm) + " ");
            printFibonnaci(numTerms, whichTerm + 1);
        }
    }

    public static void main(String[] args) {
        printFibonnaci(10, 1);
    }
}