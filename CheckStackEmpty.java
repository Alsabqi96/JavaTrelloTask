public class CheckStackEmpty {
    private int[] stackArray; // Array to store stack elements
    private int top;          // Index of the top element in the stack

    // Constructor to initialize the stack with a given size
    public CheckStackEmpty(int size) {
        stackArray = new int[size]; // Create an array of the given size
        top = -1; // Initialize top to -1, indicating the stack is empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (top < stackArray.length - 1) { // Check if the stack is not full
            top++; // Move top up
            stackArray[top] = value; // Add value to the stack
        }
    }

    // Method to remove and return the top element
    public int pop() {
        if (top >= 0) { // Check if the stack is not empty
            int value = stackArray[top]; // Get the top value
            top--; // Move top down
            return value; // Return the removed value
        }
        return -1; // Return -1 if the stack is empty
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // If top is -1, the stack is empty
    }

    // Main method to demonstrate the stack functionality
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5); // Create a stack with size 5

        // Example Input: push(1); pop(); isEmpty();
        stack.push(1); // Push 1 onto the stack
        stack.pop(); // Pop the top element from the stack

        // Check if the stack is empty
        boolean empty = stack.isEmpty();
        System.out.println(empty); // Expected Output: true
    }
}

