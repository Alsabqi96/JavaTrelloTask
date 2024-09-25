public class FirstLast6 {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(firstLast6(new int[]{1, 2, 6}));     // Output: true
        System.out.println(firstLast6(new int[]{6, 1, 2, 3}));  // Output: true
        System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3}));  // Output: false
        System.out.println(firstLast6(new int[]{6}));           // Output: true (array of length 1)
    }

    // Method to check if 6 is the first or last element
    public static boolean firstLast6(int[] nums) {
        // Check if the first element or the last element is 6
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }
}




