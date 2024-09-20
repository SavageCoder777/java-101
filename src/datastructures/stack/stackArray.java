package src.datastructures.stack;

public class stackArray {
    int values;
    int count;
    int numValues;
    int[] stackArray;
    
    public stackArray(int numInArray) {
        this.stackArray = new int[numInArray];
        this.values = numInArray;
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

    public void dequeue() {
        stackArray[0] = 0;
        for (int increase = 1; increase <= values; increase++) {
            stackArray[increase - 1] = stackArray[increase];
        }
        stackArray[values] = 0;
    }

    public void size() {
        numValues = 0;
        for (int increase = 0; increase <= values; increase++) {
            if (stackArray[increase] == 0) {
                
                numValues++;
            }
        }
        System.out.println("The queue has " + numValues + " elements.");
    }

    public void printQueue() {
        for (int increase = 1; increase <= values; increase++) {
            System.out.print(stackArray[increase] + " ");
        }
    }
}
