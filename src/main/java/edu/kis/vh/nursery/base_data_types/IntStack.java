package edu.kis.vh.nursery.base_data_types;

public interface IntStack {
    int DEFAULT = 0;
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
