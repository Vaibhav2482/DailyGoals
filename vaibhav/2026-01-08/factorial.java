import java.util.*;
public class factorial {
    
    public static int Factorial(int n) {
        int f = 1 ;
        for (int i = 1; i<= n; i++) {
            f= f * i;
        }
        return f ;

    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");
        int n = sc.nextInt();
        int result = Factorial(n);
        System.out.println(result);

    }
}
