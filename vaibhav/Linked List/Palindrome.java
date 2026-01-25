public class Palindrome {
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
  public static int size;

  public void PrintLL() {
    Node temp = Head;
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.print("null");
  }

  public void AddFirst(int data) {

    Node newNode = new Node(data);
    size++;

    if (Head == null) {
      Head = Tail = newNode;
      return;
    }

    newNode.next = Head;
    Head = newNode;
  }

  public void AddLast(int data) {
    Node newNode = new Node(data);
    size++;
    
    if (Head == null) {
      Head = Tail = newNode;
      return;
    }

    
    Tail.next = newNode;
    Tail = newNode;
  }

  //add in the midle of LL 
  public void addMidle(int idx, int data) {
    Node newNode = new Node(data);
    size++;
    Node temp = Head;
    int i = 0;
    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }


  public int revomeFirst(){
    int val = Head.data;
    Head = Head.next;
    return val;
  }

  public static void main(String[] args) {
    Palindrome ll = new Palindrome();
    ll.AddFirst(10);
    System.out.println(ll.size);
    ll.AddFirst(9);
    ll.AddFirst(8);
    System.out.println(ll.size);
    ll.AddFirst(7);
    ll.AddFirst(6);
    System.out.println(ll.size);
    ll.AddLast(11);
    ll.revomeFirst();
    System.out.println(ll.size);
    ll.PrintLL();
  }
}
