/**
 * Linked list implementation.
 * @author deca
 *
 */
public class MyLinkedList {
	
	private Node head;

	public MyLinkedList() {
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

	public class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList test = new MyLinkedList();
		System.out.println(test);
	}
}
