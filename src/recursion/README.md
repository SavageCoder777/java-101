# Recursion

- Instead of using for loops, use a function that calls
itself to do a simple task repeatedly.

e.x.
```
public int reverseSum(int input) {
        if (input == 1) {
            return 1;
        } else {
            return (input + reverseSum((input - 1)));
        }
    }
```