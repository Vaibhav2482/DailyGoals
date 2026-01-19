public class AddLastLL {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node Head;
  public static Node Tail;

  // add last method > adding the element to the last of the LL
  public void AddLast(int data) {
    // create node
    Node newNode = new Node(data);
    if (Tail == null) {
      Head = Tail = newNode;
      return;
    }
    // Tail.next = newNode
    Tail.next = newNode;
    // tail = newNode
    Tail = newNode;
  }

  public static void main(String[] args) {
    AddLastLL ll = new AddLastLL();
    ll.AddLast(1);
    ll.AddLast(2);
    ll.AddLast(3);
  }
}
