public class rangesum {
  public static int[] PrefixSum(int arr[]) {
    int[] prefixSum = new int[arr.length];
    prefixSum[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
      prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
    return prefixSum;
  }
  public static int RangeSum(int PrefixSum[],int start, int end){
    if (start == 0) {
      return PrefixSum[end];
    }else{
      return PrefixSum[end] -PrefixSum[start-1];
    }
  }
  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 2, 7, 4, 5 };
    int[] PsumArray = PrefixSum(arr);

    System.out.println("prefix sum in given range :"+ RangeSum(PsumArray, 1, 3));
  }
}  

