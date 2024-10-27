public class Split53 {
    public static void main(String[] args) {
        System.out.println(split53(new int[]{1, 1}));
        System.out.println(split53(new int[]{1, 1, 1}));
        System.out.println(split53(new int[]{2, 4, 2}));
        System.out.println(split53(new int[]{5, 3, 5, 3}));    
    }

    public static boolean split53(int[] nums) {
        return splitHelp(0, nums, 0, 0);
    }

    private static boolean splitHelp(int start, int[] nums, int sum, int summed) {
        if (start >= nums.length) {
            return sum == summed;
        }

        // If the current number is a multiple of 5, add it to sum
        if (nums[start] % 5 == 0) {
            return splitHelp(start + 1, nums, sum + nums[start], summed);
        }

        // If the current number is a multiple of 3 (but not 5), add it to summed
        if (nums[start] % 3 == 0) {
            return splitHelp(start + 1, nums, sum, summed + nums[start]);
        }

        // If it's neither, we can add it to either group
        return splitHelp(start + 1, nums, sum + nums[start], summed) ||
                splitHelp(start + 1, nums, sum, summed + nums[start]);
    }
}
