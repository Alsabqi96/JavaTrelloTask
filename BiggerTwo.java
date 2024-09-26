import java.util.Arrays;

public class BiggerTwo {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 2}, new int[]{3, 4})));  // Output: [3, 4]
        System.out.println(Arrays.toString(biggerTwo(new int[]{3, 4}, new int[]{3, 4})));  // Output: [3, 4]
        System.out.println(Arrays.toString(biggerTwo(new int[]{1, 1}, new int[]{1, 2})));  // Output: [1, 2]
    }

    // Method to return the array with the larger sum
    public static int[] biggerTwo(int[] a, int[] b) {
        // Calculate the sum of elements in array 'a'
        int sumA = a[0] + a[1];

        // Calculate the sum of elements in array 'b'
        int sumB = b[0] + b[1];

        // Return 'a' if its sum is greater or equal, otherwise return 'b'
        return (sumA >= sumB) ? a : b;
    }
}







