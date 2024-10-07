import java.util.Stack;

public class ReverseStringUsingStack {

    public static String ReverseStringUsingStack(String input) {
        Stack<Character> stack = new Stack<>(); //Create stack to hold characters

        // Step 1: Push all characters of the string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // This function to build the Reversed String
        StringBuilder reversed = new StringBuilder();

        // Step 2: I Pop characters from the stack
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString(); //Retern the reversed string
    }
    public static void main(String[] args) {
        // Example Inputs
        String original = "hello";


        // Reversing the strings
        String reversed = reverseString(original);


        // Displaying the results
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println();


    }
}









