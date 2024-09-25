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
        // If the array has fewer than 2 elements, return the array as is
        if (nums.length < 2) {
            return nums;
        }

        //create a new array of size 2
        int[] result = new int[2];
        result[0] = nums[0];
        result[0] = nums[1];

        return result;


    }
}

