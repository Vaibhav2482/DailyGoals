public class incresing {
  static void printinc(int n){
    if (n == 10) {
      System.out.print(n);
      return;
    }
    System.out.println(n+" ");
    printinc(n + 1);
  }
  public static void main(String[] args) {
    int n = 1;
    printinc(n);
  }
}
