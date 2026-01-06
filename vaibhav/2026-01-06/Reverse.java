public class Reverse {
  public static void ReverseArray(int arr[]){
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,7};
    ReverseArray(arr);
    System.out.println("Reversed Array");
    for(int nums : arr){
      System.out.print(nums+" ");
    }
  }
}
