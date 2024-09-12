package src.recursion;
public class fibonacci {
    
    public int nfibonacci(int until) {
        if (until == 1) {
            return (0);
        } else if (until == 2) {
            return (0 + 1);
        } else {
            int until1 = nfibonacci(until - 1);
            int until2 = nfibonacci(until - 2);

            System.out.print(until1 + " " + until2);
            return (until1 + until2);
        }
    }
}