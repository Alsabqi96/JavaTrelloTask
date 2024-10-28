public class Array220 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 20};
        int[] nums2 = {3, 30};
        int[] nums3 = {3};

        System.out.println( array220(nums1, 0));
        System.out.println( array220(nums2, 0));
        System.out.println( array220(nums3, 0));
    }

    public static boolean array220(int[] nums, int index) {
        // Base case:
        if (index >= nums.length - 1)
            return false;

        // Check if the next element is 10 times the current element
        return nums[index + 1] == 10 * nums[index] || array220(nums, index + 1);
    }
}

