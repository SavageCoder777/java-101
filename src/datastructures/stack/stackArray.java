package src.datastructures.stack;

public class stackArray {
    int values;
    int count;
    int numValues;
    int[] stackArray;
    int temp;
    
    public stackArray(int numInArray) {
        this.stackArray = new int[numInArray];
        this.values = numInArray - 1;
        this.count = 0;
        this.numValues = 0;
    }

    public void enqueue(int input) {
        if (count <= values) {
            stackArray[count] = input;
            count++;
        } else {
            System.out.println("The queue is full; please remove an element before adding another.");
        }
    }

    public int dequeue() {
        for (int increase = 0; increase <= values; increase++) {
            if (stackArray[increase] == 0) {
                temp = stackArray[increase - 1];
                stackArray[increase - 1] = 0;
            } else if (increase == values) {
                temp = stackArray[increase];
                stackArray[increase] = 0;
            }
        }
        return temp;
    }

    public int size() {
        numValues = 0;
        for (int increase = 0; increase <= values; increase++) {
            if (stackArray[increase] != 0) {
                numValues++;
            }
        }
        // System.out.println("The stack has " + numValues + " elements.");
        return numValues;
    }

    public void printStack() {
        for (int increase = 0; increase <= values; increase++) {
            System.out.print(stackArray[increase] + " ");
        } System.out.println();
    }
}
