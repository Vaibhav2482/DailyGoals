public class prefsum {

  public static int PrefixSum(int arr[]){
    int sum =0;
    for(int i = 0; i < arr.length; i++){
      sum += arr[i];
    }
    return sum;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,4,3,6,2,7};
    int sum = PrefixSum(arr);

    System.out.println("Prefix sum :"+sum);
  }
}