import java.util.Arrays;
public class Fix34 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4}))); // [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4, 4, 3, 1}))); // [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(new int[]{3, 2, 2, 4}))); // [3, 4, 2, 2]
    }

    public static int[] fix34(int[] nums) {
        int n = nums.length;

        // Traverse through the array to find all 4s and swap them into the correct positions
        for (int i = 0; i < n; i++) {
            // Look for a 3 that is not followed by a 4
            if (nums[i] == 3 && nums[i + 1] != 4) {
                // Find a 4 that can be swapped
                for (int j = 0; j < n; j++) {
                    if (nums[j] == 4 && (j == 0 || nums[j - 1] != 3)) {
                        // Swap the number after the 3 with this 4
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        return nums;
    }
}
