import java.util.*;
public class ContigousIntegersChecker {
    
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList to store the input numbers
        ArrayList<Integer> arr = new ArrayList<>();

        // Prompt the user to enter numbers (enter -1 to finish)
        System.out.println("Enter numbers to the list, when finished enter -1: ");
        while(true) {
            int number = sc.nextInt();
            // Break the loop if the user enters -1
            if(number == -1) {
                break;
            }
            // Add the number to the ArrayList
            arr.add(number);
        }

        // Call the function to check if the array is contiguous and print the result
        boolean result = isContiguous(arr);
        System.out.println("Is array contiguous? " + result);
    }

    // Function to check if the list contains contiguous integers
    public static boolean isContiguous(ArrayList<Integer> arr) {
        // Use a HashSet to remove duplicates and for fast lookup
        HashSet<Integer> set = new HashSet<>(arr);

        // Find the minimum and maximum value in the set
        int min = Collections.min(set);
        int max = Collections.max(set);

        // Check if all numbers between min and max are in the set
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                // Return false if any number is missing
                return false;
            }
        }

        // Return true if all numbers are present
        return true;
    }
}
