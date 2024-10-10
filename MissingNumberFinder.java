import java.util.ArrayList;
import java.util.List;

public class MissingNumberFinder {
    public static void main(String[] args) {
        // I create example input
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(1);

        // Use this to find the missing number using an ArrayList
        int missingNumber = findMissingNumber(list);

        // This display the result
        System.out.println("The missing number is: " + missingNumber);
    }

    /*
     * Function to find the missing number from the list.
     */
    public static int findMissingNumber(List<Integer> list) {
        int n = list.size();
        // Step 1: Create a boolean array of size n + 1
        boolean[] present = new boolean[n + 1];

        // Step 2: Mark the numbers present in the list
        for (int num : list) {
            if (num <= n) {
                present[num] = true;
            }
        }

        // Step 3: This used to find the first index in the boolean array that is still false
        for (int i = 0; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }

        // If no number is missing, return -1
        return -1;
    }
}
