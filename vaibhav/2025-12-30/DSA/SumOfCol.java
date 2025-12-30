import java.util.Scanner;
public class SumOfCol {
  public static void colSum(int a[][]){
    int sum;
      for (int i = 0; i < a.length; i++) {
        sum=0;
        for (int j = 0; j < a.length; j++) {
        sum = sum + a[j][i];
      }
      System.out.println("sum of " + i +" col = " + sum);
    }
  }
  public static void main(String[] args) {
    int a[][] = new int[3][3];
    int n = a.length;
    int m = a.length;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Values:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(a[i][j]+"  ");
      }
      System.out.println();
    }
    colSum(a);
  }
}
