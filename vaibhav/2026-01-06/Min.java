public class Min{
  public static int FindMin(int arr[]){
    int Min = arr[0];
    for(int i = 0; i < arr.length; i++){
      if (arr[i]<Min) {
        Min = arr[i];
      }
    }
    return Min;
  }
  public static void main(String[] args) {
    int arr[] = {2,1,9,5,3,8,0,7};
    int result = FindMin(arr);
    System.out.println("Min element is : "+result);
  }
}
