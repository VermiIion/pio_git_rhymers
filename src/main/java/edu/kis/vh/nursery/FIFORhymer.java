package edu.kis.vh.nursery;

import edu.kis.vh.nursery.arrayStack.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {


	private static final IntArrayStack stack = new IntArrayStack();
	public DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(stack);

    public FIFORhymer() {
        super(stack);
    }

    @Override
	public int countOut() {
		while (!callCheck())
			
		temp.countIn(super.countOut());
		
		int ret = temp.countOut();
		
		while (!temp.callCheck())
			
		countIn(temp.countOut());
		
		return ret;
	}
}
