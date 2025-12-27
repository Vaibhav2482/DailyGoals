public class subarray {

    public static void Print_Subarray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print("(" + array[k] + ")");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void Maxsubarraysum(int array[]) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            int start = i;
            for (int j = i; j < array.length; j++) {
                int end = j;
                cursum = 0;
                for (int k = start; k < +end; k++) {
                    cursum += array[k];

                }
                System.out.println(cursum);
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }

            
        }
        System.out.println("MAx sum is:" + maxsum);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        // Print_Subarray(array);
        
        Maxsubarraysum(array);
    }
}
