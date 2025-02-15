import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        String[] str = {"racecar", "madam", "rose", "car", "A man, a plan, a canal: Panama"}; // Added more test cases
        isPalindrome(str);
        // System.out.println(Arrays.toString(str));
    }

    public static void isPalindrome(String[] words){
        for(int i = 0; i<words.length; i++){
            boolean checkPalindrome = checkPalindrome(words[i]);
            System.out.println(words[i]+ ":" + checkPalindrome);
        }
    }

    public static boolean checkPalindrome(String word) {
        String processedWord = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0; 
        int right = processedWord.length() - 1;
        while(left<right){
            if(processedWord.charAt(left) != processedWord.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}