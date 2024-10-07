import java.util.Stack;
public class StackWithMax {

    static Stack<Integer> numbers = new Stack<>(); // Stack to hold all elements
    public static void main(String[] args){

        // Push some elements to the stack
        push(2);
        push(1);
        push(5);
        // Find and print the maximum element in the stack
        findMax();

    }

      // Method to push an element to the stack
      public static void push(Integer element) {
        numbers.push(element); // Use push method of Stack class
        System.out.println("Pushed :" + element);

      }
      // Method to find maximum element in the stack
      public static void findMax() {
        // If the stack is empty, print a meesage and return
          if (numbers.isEmpty()) {
              System.out.println("The stack is empty, No maximum element.");
              return;
          }

          // Initialize max to the first element in the stack
          Integer max = numbers.peek();

          // Iterate through each element to find the maximum
          for(Integer i : numbers) {
              if (i > max) {
                  max = i;
              }

          }

          System.out.println("The maximum element is :" + max);
      }

}

