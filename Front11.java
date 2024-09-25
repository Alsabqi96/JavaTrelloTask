import java.util.Arrays;

public class Front11 {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(Arrays.toString(front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}))); // Output: [1, 7]
        System.out.println(Arrays.toString(front11(new int[]{1}, new int[]{2})));             // Output: [1, 2]
        System.out.println(Arrays.toString(front11(new int[]{1, 7}, new int[]{})));           // Output: [1]
        System.out.println(Arrays.toString(front11(new int[]{}, new int[]{7, 9, 8})));        // Output: [7]
    }

    // Method to return a new array with the first element of each array
    public static int[] front11(int[] a, int[] b) {
        // Determine how many elements the result array will have
        if (a.length == 0 && b.length == 0) {
            return new int[] {}; // Both arrays are empty
        } else if (a.length == 0) {
            return new int[] {b[0]}; // Only array 'b' has elements
        } else if (b.length == 0) {
            return new int[] {a[0]}; // Only array 'a' has elements
        } else {
            return new int[] {a[0], b[0]}; // Both arrays have elements
        }
    }
}


