public class SimpleStack {
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public SimpleStack(int size) {
        stackArray = new int[size];
        top = -1; // Stack is initially empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (top < stackArray.length - 1) { // Check if stack is not full
            stackArray[++top] = value;
        }
    }

    // Method to remove and return the top element
    public int pop() {
        if (top >= 0) { // Check if stack is not empty
            return stackArray[top--];
        }
        return -1; // Return -1 if stack is empty
    }

    // Method to return the top element without removing it
    public int peek() {
        if (top >= 0) { // Check if stack is not empty
            return stackArray[top];
        }
        return -1; // Return -1 if stack is empty
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Main method to test the stack
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());  // Output: 30
        System.out.println(stack.peek()); // Output: 20
    }
}

