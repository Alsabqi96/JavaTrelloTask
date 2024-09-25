public class CommonEnd {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));       // Output: true
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));    // Output: false
        System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));       // Output: true
    }

    // Method to check if the arrays have the same first or last element
    public static boolean commonEnd(int[] a, int[] b) {
        // Check if the first elements or the last elements are the same
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
