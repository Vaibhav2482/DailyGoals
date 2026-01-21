public class Search {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    // Iterative Search method
    public static int searchInLL(int key) {
        Node temp = head;   // start from first node
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;   // key found
            }
            temp = temp.next;  // move to next node
            index++;
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println(searchInLL(4)); 
    }
}
