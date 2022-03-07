package edu.kis.vh.nursery.base_data_types;

public class IntArrayStack implements IntStack {

    final static int CAPACITY = 12;
    final static int EMPTY = -1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    @Override
    public boolean isEmpty() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == CAPACITY-1;
    }

    @Override
    public int top() {
        return 0;
    }

    @Override
    public int pop() {
        if (isEmpty())
            return IntStack.DEFAULT;
        return numbers[total--];
    }
    public int peakaboo(){
        if (isEmpty())
            return IntStack.DEFAULT;
        return top();
    }
}