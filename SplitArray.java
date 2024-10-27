import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{2, 2}));
        System.out.println(splitArray(new int[]{2, 3}));
        System.out.println(splitArray(new int[]{5, 2, 3}));
        System.out.println(splitArray(new int[]{3, 5}));      
    }

    public static boolean splitArray(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        // If total sum is odd, cannot split into two equal groups
        if (totalSum % 2 != 0) {
            return false;
        }
        return canSplit(nums, totalSum / 2, 0);
    }

    private static boolean canSplit(int[] nums, int target, int index) {
        // Base case: found a subset with the target sum
        if (target == 0) {
            return true;
        }
        // Base case: if we exceed the target sum or finish the array
        if (target < 0 || index >= nums.length) {
            return false;
        }
        // Include current number in the sum or exclude it
        return canSplit(nums, target - nums[index], index + 1) ||
                canSplit(nums, target, index + 1);
    }
}

