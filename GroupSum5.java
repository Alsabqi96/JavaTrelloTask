public class GroupSum5 {
    public static void main(String[] args) {
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 19));
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 17));
        System.out.println(groupSum5(0, new int[]{2, 5, 10, 4}, 12)); 
    }

    public static boolean groupSum5(int start, int[] nums, int target) {
        // Base case: if start reaches the end of nums, check if target is 0
        if (start >= nums.length) {
            return target == 0;
        }

        // If the current element is a multiple of 5, include it in the sum
        if (nums[start] % 5 == 0) {
            // If the next element is 1, skip it
            if (start + 1 < nums.length && nums[start + 1] == 1) {
                return groupSum5(start + 2, nums, target - nums[start]);
            } else {
                return groupSum5(start + 1, nums, target - nums[start]);
            }
        }

        // Recursive calls:
        // 1. Include the current element in the sum
        if (groupSum5(start + 1, nums, target - nums[start])) {
            return true;
        }

        // 2. Exclude the current element from the sum
        return groupSum5(start + 1, nums, target);
    }
}
