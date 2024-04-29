
public class Node {
	private Node current;
	private int value = 0;
	private Node next = null;
	
	public Node() {
	}
	
	public Node(int value) {
		this.value = value;
	}
	
	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	public Node getCurrent() {
		return current;
	}

	public int getValue() {
		return value;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
