public class reverse {
    public static void main(String[] args) {
        String str = "hello world";
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Original string :" + str );
        System.out.println("Reversed string :" + reverse );
    }
}
