public class vowels {
    public static void main(String[] args) {
        String str = "VowelsAndconsonents";
        int vowels = 0;
        int consonents = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                    vowels++;
                }else{
                    consonents++;
                }
            }
        }
        System.out.println("original string :" + str);
        System.out.println("vowels :" + vowels);
        System.out.println("consonents:" + consonents);
    }
}