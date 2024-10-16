import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class UniquePairsWithTargetSum {
    public static void main(String[] args) {
        //I create an ArrayList with the input numbers
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(7);
        nums.add(-1);
        nums.add(5);

        //I use this to  define the target sum
        int target = 6;

        // Call the function to find and print the pairs
        findPairs(nums, target);
    }

    // This  Function to find and print unique pairs that add up to the target sum
    public static void findPairs(List<Integer> nums, int target) {
        // I used this to store numbers we have already seen
        HashSet<Integer> seen = new HashSet<>();
        // This to store and avoid printing duplicate pairs
        HashSet<String> printedPairs = new HashSet<>();

        // Iterate through the ArrayList
        for (int num : nums) {
            // This to calculate the complement
            int complement = target - num;
            // If we've seen the complement, we found a valid pair
            if (seen.contains(complement)) {
                String pair = num + "," + complement;
                String reversePair = complement + "," + num;

                // Print only if the pair hasn't been printed yet
                if (!printedPairs.contains(pair) && !printedPairs.contains(reversePair)) {
                    System.out.println("(" + num + ", " + complement + ")");
                    printedPairs.add(pair);
                }
            }
            // Add the current number to the seen set
            seen.add(num);
        }
    }
}



