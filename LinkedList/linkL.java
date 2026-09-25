public class linkL {
    public static void main(String[] args) {
        Linked list = new Linked();
        list.inserthead(1);
        list.inserthead(2);
        list.inserthead(3);

        // Fix 1: You must call your method here to actually see it print!
        list.printList(); 
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linked {
    Node head;
    Node tail;

    public void inserthead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        Node current = head;

        // Fix 2: Using print() instead of println() keeps the chain on one line
        while (current != null) {
            System.out.print(current.data + " -> "); 
            current = current.next;
        }
        
        // Fix 3: Replaced "This is empty linked list" with "null" 
        // because the loop only finishes when it reaches the end of the chain.
        System.out.println("null"); 
    }
}
