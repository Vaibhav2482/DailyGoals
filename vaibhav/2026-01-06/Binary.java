public class Binary {
  public static int BinarySearch(int arr[], int key){
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      else if (key > arr[mid]) {
        start = mid + 1;
      }else{
        start = mid -1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
    int key = 4;
    int result = BinarySearch(arr, key);
    System.out.println(result);
  }
}
