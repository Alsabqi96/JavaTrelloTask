import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairWithTargetSum {

    public static void main(String[] args) {
        // Step 1: I create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);

        // Step 2: I define the target sum
        int target = 6;

        // Step 3: I check if the pair exists
        boolean result = hasPairWithSum(numbers, target);

        // Step 4: I display the result
        System.out.println("Pair with target sum exists: " + result);

    }

    //This  function to check if there's a pair that adds up to the target sum
    public static boolean hasPairWithSum(List<Integer> numbers, int target) {
        // Step 5: Create a set to store visited numbers
        Set<Integer> seenNumbers = new HashSet<>(); 

        // Step 6: Loop through each number in the list
        for (int num : numbers) {
            int complement = target - num; // Find the complement number (target - current number)

            // Step 7: Check if the complement exists in the set
            if (seenNumbers.contains(complement)) {
                return true; // If it exists, return true (pair found)
            }

                // Step 8: Add the current number to the set
                seenNumbers.add(num);
            }

            return false; // If no pair is found, return false
        }
    }


