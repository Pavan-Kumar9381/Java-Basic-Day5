public class StringUtils {

    // Reverse a string
    static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Check if string is palindrome
    static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverse(str));
    }

    // Count vowels
    static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "madam";

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reverse(text));
        System.out.println("Is Palindrome? " + isPalindrome(text));
        System.out.println("Vowel Count: " + countVowels(text));
    }
}