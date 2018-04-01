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

    public int[] toArray() {
        int[] output = new int[this.size];
        Node temp = this.head;
        if(temp == null) {
            return null;
        }
        int counter = 0;
        while(temp.next != null) {
            output[counter] = temp.data;
            counter++;
            temp = temp.next;
        }
        output[this.size-1] = temp.data;
        return output;
    }

    public String toString() {
        String output = "";
        Node temp = this.head;
        if(temp == null) {
            return output;
        }
        while(temp.next != null) {
            output += temp.data + " ";
            temp = temp.next;
        }
        // This avoids having an additional space on the end.
        output += temp.data;
        return output;
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

    public static void main(String[] args) {
        MyDoubleLinkedList test = new MyDoubleLinkedList();
        test.add(3);
        test.add(5);
        test.add(7);
        System.out.println("toString Test: " + test.toString());
        System.out.println("size Test: " + test.size());
        int[] testArray = test.toArray();
        System.out.println("toArray Test: ");
        for(int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
        System.out.println();
        System.out.println("isEmpty Test: " + test.isEmpty());
        MyDoubleLinkedList empty = new MyDoubleLinkedList();
        System.out.println(empty.toString());
        System.out.println(empty.size());
        System.out.println(empty.toArray());
        System.out.println(empty.isEmpty());
    }
}