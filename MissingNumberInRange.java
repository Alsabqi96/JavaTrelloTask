import java.util.ArrayList;
import java.util.List;

public class MissingNumberInRange {

    public static void main(String[] args) {
        // Used sorted list of unique numbers and the range [lower, upper]
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);

        int lower = 1;
        int upper = 10;

        // This for call the function to find the missing numbers
        List<Integer> missingNumbers = findMissingNumbers(nums, lower, upper);

        // This is output the missing numbers
        System.out.println("Missing numbers: " + missingNumbers);
    }

    // Function to find missing numbers in the range [lower, upper]
    public static List<Integer> findMissingNumbers(List<Integer> nums, int lower, int upper) {
        List<Integer> missingNumbers = new ArrayList<>();

        // Iterate through each number in the range [lower, upper]
        for (int i = lower; i <= upper; i++) {
            // If the current number is not in the nums list, add it to the missingNumbers list
            if (!nums.contains(i)) {
                missingNumbers.add(i);
            }
        }

        // Return the list of missing numbers
        return missingNumbers;
    }
}

