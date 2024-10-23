import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberFinder {
    public static void main(String[] args) {
        // Example input
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(1);

        // Find the missing number using a HashSet
        int missingNumber = findMissingNumber(list);

        // Display the result
        System.out.println("The missing number is: " + missingNumber);
    }

    /*
     * Function to find the missing number from the list using a HashSet.
     */
    public static int findMissingNumber(List<Integer> list) {
        int n = list.size();
        // Step 1: Create a HashSet to track numbers
        Set<Integer> present = new HashSet<>();

        // Step 2: Add numbers from the list to the HashSet
        for (int num : list) {
            present.add(num);
        }

        // Step 3: Find the first number from 0 to n that is missing in the HashSet
        for (int i = 0; i <= n; i++) {
            if (!present.contains(i)) {
                return i;
            }
        }

        // If no number is missing, return -1 (though this shouldn't happen in a proper sequence)
        return -1;
    }
}
