import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingNumberInRange {

    public static void main(String[] args) {
        //I used sorted list of unique numbers and the range [lower, upper]
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(7);

        int lower = 1;
        int upper = 10;

        // This to call the function to find the missing numbers
        List<Integer> missingNumbers = findMissingNumbers(nums, lower, upper);

        // Output the missing numbers
        System.out.println("Missing numbers: " + missingNumbers);
    }

    // Function to find missing numbers in the range [lower, upper]
    public static List<Integer> findMissingNumbers(List<Integer> nums, int lower, int upper) {
        List<Integer> missingNumbers = new ArrayList<>();

        // Convert the List to a Set for faster lookup
        Set<Integer> numsSet = new HashSet<>(nums);

        // Iterate through each number in the range [lower, upper]
        for (int i = lower; i <= upper; i++) {
            // If the current number is not in the numsSet, add it to the missingNumbers list
            if (!numsSet.contains(i)) {
                missingNumbers.add(i);
            }
        }

        // Return the list of missing numbers
        return missingNumbers;
    }
}



