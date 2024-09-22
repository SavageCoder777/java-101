package src.recursion;

public class fibonacci {
    
    public int nfibonacci(int until) {
        if (until == 1) {
            return (0);
        } if (until == 2) {
            return (1);
        } return nfibonacci(until - 1) + nfibonacci(until - 2);
    }

    public void printFibonnaci(int numTerms, int startTerm) {
        if (startTerm <= numTerms) {
            System.out.print(nfibonacci(startTerm) + " ");
            printFibonnaci(numTerms, startTerm + 1);
        }
    }
}