public class Pairs {
  public static void FindPairsum(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;
    boolean found = false;
    if (arr == null || arr.length < 2) {
      System.out.println("not found");
      return;
    }
    while (start < end) {
      int crr = arr[start] + arr[end];
      if (crr == target) {
        System.out.println("pair found (" + arr[start] + "," + arr[end] + "): " + target);
        found = true;
        start++;
        end--;
      } else if (crr < target) {
        start++;
      } else {
        end--;
      }
    }
    if (!found) {
      System.out.println("Not Found");
    }
  }
  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    int target = 12;
    FindPairsum(arr, target);
  }
}
