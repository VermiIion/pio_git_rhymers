package edu.kis.vh.nursery;

import edu.kis.vh.nursery.base_data_types.IntStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	int totalRejected = 0;

    public HanoiRhymer(IntStack stack) {
        super(stack);
    }

	public HanoiRhymer() {
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
