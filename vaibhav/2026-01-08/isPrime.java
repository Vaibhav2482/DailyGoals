import java.util.*;
@SuppressWarnings("unused")
public class isPrime {
    
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for(int i=2 ; i<=Math.sqrt(n); i++) {
            if (n % i== 0) {
                return false;
            }
        }return true;
    
    }
    
    public static void primeinrenge(int n) {
        for ( int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        System.out.println(isprime(99));
        primeinrenge(30);
    }
}
