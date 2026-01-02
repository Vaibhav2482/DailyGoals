public class Swap{
  public static void ReverseArray(int arr[]){
    int start =0; int end = arr.length-1;
    while (start < end) {

      // swapping of two elements
      int temp = arr[end];
      arr[end] = arr[start];
      arr[start] = temp;

      start++; 
      end--;
    }
  }
  public static void main(String[] args) {
    int arr[]= {3,5,2,7,8,10};
    ReverseArray(arr);
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();

  }
}
/*this is reverse of an array using two pointers. this approach uses the only
two variables with constant space, and start and end are the two variables. 
start is the first element in array and end is last. start move forward 
and end comes backwards. using the third variable we swap the start and 
end values and without using another array,and we get reverse array
with time complexity : O(n)
  */