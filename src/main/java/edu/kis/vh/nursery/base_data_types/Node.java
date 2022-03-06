package edu.kis.vh.nursery.base_data_types;

public class Node {

	public int value;
	public Node prev, next;

	public Node(int i) {
		value = i;
	}
	public int getValue() {
		return value;
	}

	/**
	 * @return previous node
	 */
	public Node getPrev() {
		return prev;
	}

	/**
	 * @param prev previous node to set
	 */
	public void setPrev(Node prev) {
		this.prev = prev;
	}

	/**
	 * @return next node
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param next next node to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
}
