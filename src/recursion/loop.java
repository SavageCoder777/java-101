package src.recursion;

public class loop {
    public int reverseSum(int input) {
        int sum = 0;
        for (int reduce = input; reduce >= 1; reduce--) {
            sum += reduce;
        }
        return sum;
    }

    public int forwardSum(int start, int end) {
        int sum = 0;
        for (int increase = start; increase <= end; increase++) {
            sum += increase;
        }
        return sum;
    }

    public int reverseFactorial(int input) {
        int product = 1;
        for (int reduce = input; reduce >= 1; reduce--) {
            product *= reduce;
        }
        return product;
    }
}