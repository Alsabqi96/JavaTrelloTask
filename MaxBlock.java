public class MaxBlock {
    public static int maxBlock(String str) {
        int len = str.length();
        int count = 1; // Start count as 1
        int tmpcount = 1;

        // If the string is empty, return 0
        if (len == 0)
            return 0;

        // Iterate through the string
        for (int i = 0; i < len - 1; i++) {
            // Check if the current character matches the next one
            if (str.charAt(i) == str.charAt(i + 1)) {
                tmpcount++;
            } else {
                tmpcount = 1;
            }
            count = Math.max(count, tmpcount);
        }

        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla")); // Output: 2
        System.out.println(maxBlock("abbCCCddBBBxx")); // Output: 3
        System.out.println(maxBlock("")); // Output: 0
        System.out.println(maxBlock("xyz")); // Output: 1
    }
}








