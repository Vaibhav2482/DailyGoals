import java.util.*;
public class Palindrome {
  public static boolean isPalindrome(String str){
    str = str.toLowerCase();
    int left = 0; int right = str.length()-1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--; 
    }
    return true;
  }
  public static void main(String[] args) {
    String str[]  = {"racecar", "hello", "12321", "madam"};
    for (int i = 0; i < str.length; i++) {
    System.out.println(str[i] + " = " + isPalindrome(str[i]));
}
  }
}
/*
by using two-pointer approach to check if a string is a palindrome. Starting with two pointers. left at index 0 and right at the last index, it compares characters from both ends moving inward. If any pair of characters not match, it returns false, indicating the string is not a palindrome. if all corresponding character pairs match throughout the entire string does it return true. The string is first converted to lowercase to ensure case-insensitive comparison, making "Racecar" and "racecar" both valid palindromes.
Time Complexity: O(n) */