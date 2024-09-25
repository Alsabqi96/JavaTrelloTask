import java.util.Arrays;

public class FrontPiece {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2, 3})));  // Output: [1, 2]
        System.out.println(Arrays.toString(frontPiece(new int[]{1, 2})));     // Output: [1, 2]
        System.out.println(Arrays.toString(frontPiece(new int[]{1})));        // Output: [1]
        System.out.println(Arrays.toString(frontPiece(new int[]{})));         // Output: []
    }

    // Method to return a new array with the first 2 elements of the given array
    public static int[] frontPiece(int[] nums) {
        // If the array has fewer than 2 elements, return a copy of the whole array
        if (nums.length < 2) {
            return nums;
        }

        // Otherwise, return a new array containing the first 2 elements
        return Arrays.copyOf(nums, 2);
    }
}

