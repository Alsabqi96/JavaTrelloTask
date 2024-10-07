import java.util.Stack;
public class DuplicateParteners {
    public static void main(String[] args) {
        // Test cases
        System.out.println(hasDuplicateParentheses("((a+b)+(c+d))")); // Output: false
        System.out.println(hasDuplicateParentheses("((a+b))"));       // Output: true

    }

    // Method to check for duplicate parentheses
    public static boolean hasDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // If it's a closing parenthesis, check for duplicates
            if (ch == ')') {
                int count = 0;
                // Pop elements from the stack until finding an opening parenthesis
                while (!stack.isEmpty() && stack.peek() != '(') {
                    stack.pop();
                    count++;
                }

                // Pop the opening parenthesis '('
                stack.pop();

                // If count is 0, then it's a duplicate set of parentheses
                if (count == 0) {
                    return true;
                }
            } else {
                // Push every other character onto the stack
                stack.push(ch);
            }
        }

        return false; // No duplicates found
    }
}

