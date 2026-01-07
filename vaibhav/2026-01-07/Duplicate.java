public class Duplicate {
  public static boolean FindDuplicate(int arr[]){
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }
    return false;
  }
   public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6,9};
    if (FindDuplicate(arr) == true) {
      System.out.println("Found Duplicate");
    }else{
      System.out.println("Not fonund");
    }
   }
}