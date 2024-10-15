import java.util.*;

public class CountDistinctElemenstInEveryWindowofSizeK {
    public static void main(String[] args) {
        // This is example list
        List<Integer> nums = Arrays.asList(1, 2, 1, 3, 4, 2, 3);
        Integer size = nums.size();
        //Sliding window size
        Integer k = 4;
        List<Integer> result = new ArrayList<>();

        // Loop over the sliding window
        for (int i = 0; i <= size - k; i++) {
            Set<Integer> box = new HashSet<>();
            // Add elements of the current window into the set to count distinct elements
            for (int j = i; j < i + k; j++) {
                box.add(nums.get(j));
            }
            // Add the size of the set (number of distinct elements) to the result list
            result.add(box.size());
        }

        // Output the result
        System.out.println("Distinct counts in each sliding window: " + result);
    }
}
