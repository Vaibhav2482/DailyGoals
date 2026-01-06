public class isSorted {
  public static boolean CheckisSorted(int arr[]){
    for(int i =0; i < arr.length-1; i++){
      if(arr[i] > arr[i+1]){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,1,5,6,7};
    boolean result =CheckisSorted(arr);
    System.out.println(result);
  }
}
