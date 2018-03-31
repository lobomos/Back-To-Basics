/**
 * Linked list implementation.
 * @author deca
 *
 */
public class MySinglyLinkedList {
	
	private Node head;

	public MySinglyLinkedList() {
		this.head = null;
	}
	
	public Node addNode(Node toAdd) {
		if(this.head == null) {
			this.head = toAdd;
			return head;
		}
		Node temp = this.head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		return head;
	}

	// Just for testing.
	public static void main(String[] args) {
		
	}
}

class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}
