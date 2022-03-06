package edu.kis.vh.nursery.base_data_types;

public interface IntStack {
    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
