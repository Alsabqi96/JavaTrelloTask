import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    // Function to reverse the string using a stack
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from the stack and build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString(); // Return the reversed string
    }
}



