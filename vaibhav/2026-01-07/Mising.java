public class Mising {
  public static int FindMissing(int arr[]){
    int Actual_Sum = 0;
    int n = 5;
    int Expected_Sum = n*(n+1)/2;
    for(int i = 0; i < arr.length; i++){
      Actual_Sum+= arr[i];
    }
    int MissingElement = Expected_Sum - Actual_Sum;
    return MissingElement;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,4,5};
    System.out.println("The Missing Element is : "+FindMissing(arr));
  }
}
