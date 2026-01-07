public class zerostoend {
  public static void MoveZerostoEnd(int arr[]){
    int pos = 0;
    for(int i = 0; i < arr.length; i++){
      if (arr[i] != 0) {
       arr[pos] = arr[i];
       pos++;
      }
    }
    while (pos < arr.length) {
      arr[pos] = 0;
      pos++;
    }
  }

  public static int KadanesAlgorithm(int array[]){
    int MS = 0;
    int CS = 0;
    for(int i = 0; i < array.length; i++){
      CS += array[i];
      if (CS < 0) {
        CS = 0;
      }
      MS = Math.max(MS, CS);
    }
    return MS;
  }
  public static void main(String[] args) {
    int arr[] = {0,1,0,3,4,0,2};
    int array[] ={-1,3,-4,4,-2,3};
    MoveZerostoEnd(arr);
    System.out.println("Max Sum: "+KadanesAlgorithm(array));
    for(int i = 0; i < arr.length; i++){
      System.out.print("["+arr[i]+"]");
    }
  }
}
