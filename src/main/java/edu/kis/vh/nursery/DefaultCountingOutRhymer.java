package edu.kis.vh.nursery;

import edu.kis.vh.nursery.base_data_types.IntLinkedList;
import edu.kis.vh.nursery.base_data_types.IntStack;

public class DefaultCountingOutRhymer {

	private final IntStack stack;

	public DefaultCountingOutRhymer(IntStack stack) {
		this.stack = stack;
	}

	public DefaultCountingOutRhymer() {
		this.stack = new IntLinkedList();
	}

	public void countIn(int in) {
		stack.push(in);
	}
	public boolean callCheck() {
		return stack.isEmpty();
	}


	public boolean isFull() {
		return stack.isFull();
	}


	public int countOut() {
		return stack.pop();
	}

	protected int peekaboo() {
		if (callCheck())
			return IntStack.DEFAULT;
		return stack.top();
	}
}