 import java.util.Arrays;
public class SwapEnds {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3, 4})));  // Output: [4, 2, 3, 1]
        System.out.println(Arrays.toString(swapEnds(new int[]{1, 2, 3})));     // Output: [3, 2, 1]
        System.out.println(Arrays.toString(swapEnds(new int[]{8, 6, 7, 9, 5}))); // Output: [5, 6, 7, 9, 8]
        System.out.println(Arrays.toString(swapEnds(new int[]{42})));          // Output: [42]
    }

    // Method to swap the first and last elements of an array
    public static int[] swapEnds(int[] nums) {
        // If the array has only 1 element, no need to swap
        if (nums.length > 1) {
            // Swap the first and last elements
            int temp = nums[0];  // Store the first element in a temp variable
            nums[0] = nums[nums.length - 1];  // Assign the last element to the first position
            nums[nums.length - 1] = temp;  // Assign the original first element to the last position
        }
        return nums;
    }
}
