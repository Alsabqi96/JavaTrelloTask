import java.util.Stack;
public class SimplePalindromeChecker {

    public static void main(String[] args) {
        String str = "racecar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome ");
        } else {
            System.out.println(str + " is NOT a palindrome ");

        }
    }
    // Function to check if a string is a palindromre
    public static boolean isPalindrome(String str) {

    // Create a stack to store characters of the string
        Stack<Character> stack = new Stack<>();
    // Push all characters of the string onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

    // Create a string to build the reversed version
     StringBuilder reversedStr = new StringBuilder();

    // Pop all characters from the stack to get the reversed string
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());



        }

        // Check if the reversed string is the same as the original
        return reversedStr.toString().equals(str);
    }
}




