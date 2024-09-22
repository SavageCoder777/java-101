package src.datastructures.queue;

public class queueArray {
    int values;
    int count;
    int numValues;
    int[] queueArray;
    int temp;
    
    public queueArray(int numInArray) {
        this.queueArray = new int[numInArray];
        this.values = numInArray - 1;
        this.count = 0;
        this.numValues = 0;
    }

    public void enqueue(int input) {
        if (count <= values) {
            queueArray[count] = input;
            count++;
        } else {
            System.out.println("The queue is full; please remove an element before adding another.");
        }
    }

    public int dequeue() {
        temp = queueArray[0];
        queueArray[0] = 0;
        for (int increase = 1; increase <= values; increase++) {
            queueArray[increase - 1] = queueArray[increase];
        }
        queueArray[values] = 0;
        return temp;
    }

    public int size() {
        numValues = 0;
        for (int increase = 0; increase <= values; increase++) {
            if (queueArray[increase] != 0) {
                numValues++;
            }
        }
        // System.out.println("The queue has " + numValues + " elements.");
        return numValues;
    }

    public void printQueue() {
        for (int increase = 0; increase <= values; increase++) {
            System.out.print(queueArray[increase] + " ");
        } System.out.println();
    }
}