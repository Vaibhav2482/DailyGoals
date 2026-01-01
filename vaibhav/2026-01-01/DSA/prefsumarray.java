public class prefsumarray {

  public static int[] PrefixSum(int arr[]) {
    int[] prefixSum = new int[arr.length];
    prefixSum[0] = arr[0];

    for (int i = 1; i < arr.length; i++) {
      prefixSum[i] = prefixSum[i - 1] + arr[i];
    }
    return prefixSum;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 2, 7, 4, 5 };
    int[] PsumArray = PrefixSum(arr);

    for(int sum : PsumArray){
      System.out.print(sum + " ");
    }
    System.out.println();
  }
}
