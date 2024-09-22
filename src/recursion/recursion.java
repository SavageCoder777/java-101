package src.recursion;
public class recursion {
    
    public int reverseSum(int input) {
        if (input == 1) {
            return 1;
        } else {
            return (input + reverseSum((input - 1)));
        }
    }

    public int forwardSum(int start, int end) {
        if (start == end) {
            return end;
        } else {
            return (start + forwardSum((start + 1), end));
        }
    }

    public int reverseFactorial(int input) {
        if (input == 1) {
            return 1;
        } else {
            return (input * reverseFactorial((input - 1)));
        }
    }
}