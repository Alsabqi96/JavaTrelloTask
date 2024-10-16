import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class FindAllPairswithaGivenSum {
    public static void main(String[] args) {
            //I  create an ArrayList with the input numbers
            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            nums.add(5);
            nums.add(7);
            nums.add(-1);
            nums.add(5);

           // I use target sum
            int target = 6;

            // Call the function to find and print the pairs
            findPairs(nums, target);
        }

        //This is  function to find and print pairs that add up to the target sum
        public static void findPairs(List<Integer> nums, int target) {
            HashSet<Integer> seen = new HashSet<>();

            // Iterate through the ArrayList
            for (int num : nums) {
                // This to calculate the complement
                int complement = target - num;

                // If we've already seen the complement, we found a pair
                if (seen.contains(complement)) {
                    System.out.println("(" + complement + ", " + num + ")"); // Print the pair
                }

                // Add the current number to the seen set
                seen.add(num);
            }
        }
    }


