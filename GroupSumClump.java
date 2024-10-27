public class GroupSumClump {
    public static void main(String[] args) {
        System.out.println(groupSumClump(0, new int[]{2, 4, 8}, 10));
        System.out.println(groupSumClump(0, new int[]{1, 2, 4, 8, 1}, 14));
        System.out.println(groupSumClump(0, new int[]{2, 4, 4, 8}, 14)); 
    }

    public static boolean groupSumClump(int start, int[] nums, int target) {
        // Base case: if start index reaches the end of nums
        if (start >= nums.length) {
            return target == 0;
        }

        // Calculate sum of clumped elements
        int sum = nums[start];
        int count = 1;

        // Find the length of clump and calculate clumped sum
        for (int i = start + 1; i < nums.length && nums[i] == nums[start]; i++) {
            sum += nums[i];
            count++;
        }

        // Recursive calls:
        // 1. Include the clumped sum in the target and skip to the next distinct element.
        if (groupSumClump(start + count, nums, target - sum)) {
            return true;
        }

        // 2. Exclude the clumped sum from the target and skip to the next distinct element.
        return groupSumClump(start + count, nums, target);
    }
}

