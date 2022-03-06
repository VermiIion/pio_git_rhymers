package edu.kis.vh.nursery;

import edu.kis.vh.nursery.arrayStack.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final IntArrayStack stack = new IntArrayStack();
	int totalRejected = 0;

    public HanoiRhymer() {
        super(stack);
    }

    public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
