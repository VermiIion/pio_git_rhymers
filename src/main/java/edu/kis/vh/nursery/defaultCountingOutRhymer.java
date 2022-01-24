package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private int[] NUMBERS = new int[12];

	public int total = -1;

	/**
	 * @param in
	 */
	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return
	 */
		public boolean callCheck() {
			return total == -1;
		}

	/**
	 * @return
	 */
			public boolean isFull() {
				return total == 11;
			}

	/**
	 * @return
	 */
				protected int peekaboo() {
					if (callCheck())
						return -1;
					return NUMBERS[total];
				}

	/**
	 * @return
	 */
					public int countOut() {
						if (callCheck())
							return -1;
						return NUMBERS[total--];
					}

}
