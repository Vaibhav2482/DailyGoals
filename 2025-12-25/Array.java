public class Array {
    
    public static int Largest_num(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smalest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i ++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smalest > numbers[i]) {
                smalest = numbers[i];
                
            }
          
        } 
        System.out.println(smalest);
        return largest;
    }


    public static void reverse_array(int numbers[]) {
        int start = 0, last = numbers.length - 1;

        while (start < last) {
            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;
            start++;
            last--;
        }


    }
    
    public static void printreversearray(int numbers[]) {
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");

        }
    }

public static void MaxSubarraySum(int array[]) {
    int CurrSum = 0;
    int MaxSum = Integer.MIN_VALUE;
    for(int i = 0; i < array.length; i++) {
        int start = i;
        for(int j = i; j < array.length; j++) {
            int end = j;
            CurrSum = 0;
            for(int k = start; k <= end; k++) {
                CurrSum = array[k];
            }
            System.out.print(CurrSum + " ");
            if (MaxSum < CurrSum) {
                MaxSum = CurrSum;
            }
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int array[] = {1, -2, 6, -1, 3};
        System.out.println("largest number is :" + Largest_num(numbers));
        reverse_array(numbers);
        printreversearray(numbers);
        MaxSubarraySum(array);
       
     

    }

   

    
}
