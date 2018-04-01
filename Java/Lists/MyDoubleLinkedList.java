public class MyDoubleLinkedList {
    
    private Node head, tail;
    private int size;

    public MyDoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Node add(int data) {
        if(this.head == null) {
            this.head = new Node(data);
            this.tail = this.head;
            this.size++;
        }
        else {
            Node temp = this.head;
            while(temp.next != null) {
                temp = temp.next;
            }
            // Create new node that is temp data.
            temp.next = new Node(data);
            temp.next.prev = temp;
            this.tail = temp.next;
            this.size++;
        }
        return this.head;
    }
    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
    
    private class Node {
        
        private int data;
        private Node next, prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}