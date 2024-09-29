public class MaxTriple {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(maxTriple(new int[]{1, 2, 3}));  // Output: 3
        System.out.println(maxTriple(new int[]{1, 5, 3}));  // Output: 5
        System.out.println(maxTriple(new int[]{5, 2, 3}));  // Output: 5
    }

    // Method to return the maximum of the first, middle, and last elements
    public static int maxTriple(int[] nums) {
        // Identify the first, middle, and last elements
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        // Return the maximum of the three
        return Math.max(first, Math.max(middle, last));
    }
}

