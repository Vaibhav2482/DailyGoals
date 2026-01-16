public class MergeSort {

  public static void Mergesort(int arr[], int si, int ei){
    if (si >= ei) {
      return;
    }

    int mid = si + (ei - si) / 2;
    Mergesort(arr,si,mid);
    Mergesort(arr,mid+1,ei);
    merge(arr,si,mid,ei);

  }

  public static void merge(int arr[], int si,int mid ,int ei) {
    int temp[] = new int[ei - si + 1];
    int i = si;   // iterator for starting right part
    int j = mid + 1; // iterator for ending left part
    int k= 0;  // iterator for temp. for storing the elements in temp  

    while (i <= mid && j <= ei) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      }else{
        temp[k] = arr[j];
        j++;
      }
      k++;
    }


    // left part 
    while (i <= mid) {
      temp[k++] = arr[i++];
    }

    //right part
     while (j <= ei) {
      temp[k++] = arr[j++];
    }

    //copying the temp elements in arr 
    for (k= 0, i = si; k < temp.length; k++, i++){
      arr[i] = temp[k];
    }
  }

  public static void print(int arr[]){
        for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main (String agrs[]){
    int arr[] = {2,6,3,8,1,4,7};
    Mergesort(arr, 0, arr.length-1);
    print(arr);
  }
}