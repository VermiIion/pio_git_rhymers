package edu.kis.vh.nursery;

import edu.kis.vh.nursery.base_data_types.IntLinkedList;
import edu.kis.vh.nursery.base_data_types.IntStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

	private final IntStack temp = new IntLinkedList();

    public FIFORhymer(IntStack stack) {
        super(stack);
    }

	public FIFORhymer() {
	}

	@Override
	public int countOut() {
		while (!callCheck())
			
		super.countIn(super.countOut());
		
		int ret = super.countOut();
		
		while (!super.callCheck())
			
		countIn(super.countOut());
		
		return ret;
	}
}
