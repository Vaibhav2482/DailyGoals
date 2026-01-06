public class Max{
  public static int FindMax(int arr[]){
    int Max = arr[0];
    for(int i = 0; i < arr.length; i++){
      if (arr[i]>Max) {
        Max = arr[i];
      }
    }
    return Max;
  }
  public static void main(String[] args) {
    int arr[] = {2,1,9,5,3,8,2,7};
    int result = FindMax(arr);
    System.out.println("Max element is : "+result);
  }
}
