import java.util.HashSet;
public class PalindromePermutation {
    public static void main(String[] args){
        String s1 = "taco cat";
        String s2 = "racecar";
        String s3 = "hello";

        // Check if permutations can form palindromes
        System.out.println(canFormPalindrome(s1));
        System.out.println(canFormPalindrome(s2));
        System.out.println(canFormPalindrome(s3));
    }
    public static boolean canFormPalindrome(String s) {
        // Set to track characters with odd counts
        HashSet<Character> oddChars = new HashSet<>();

        // Normalize the string by removing spaces and converting to lowercase
        for (char c : s.toCharArray()) {
            // Check if the character is alphanumeric
            if (Character.isLetterOrDigit(c)) {
                // Convert to lowercase
                c = Character.toLowerCase(c);
                // If the character is already in the set, remove it; otherwise, add it
                if (oddChars.contains(c)) {
                    // Remove from set if present (even count)
                    oddChars.remove(c);
                } else {
                    // Add to set if not present (odd count)
                    oddChars.add(c);
                }
            }
        }
        // A palindrome can have at most one character with an odd count
        return oddChars.size() <= 1; 
    }
}

