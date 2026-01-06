public class Linear {
  public static boolean LinearSearch(int arr[], int key){
    for(int i =0; i < arr.length-1; i++){
      if (arr[i] == key) {
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args) {
    int arr[] ={1,4,32,5,8,1};
    int key = 32;
    System.out.println(LinearSearch(arr, key));
  }
}
