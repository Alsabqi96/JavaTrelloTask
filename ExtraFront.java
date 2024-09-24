public class ExtraFront {

    public static void main(String[] args) {
        // Test cases
        System.out.println(extraFront("Hello"));  // Output: "HeHeHe"
        System.out.println(extraFront("ab"));     // Output: "ababab"
        System.out.println(extraFront("H"));      // Output: "HHH"
        System.out.println(extraFront(""));       // Output: ""
    }

    // Method to return 3 copies of the first 2 characters
    public static String extraFront(String str) {
        // Check if the string has fewer than 2 characters
        String firstTwo;
        if (str.length() < 2) {
            firstTwo = str;  // Use whatever is available
        } else {
            firstTwo = str.substring(0, 2);  // Get the first 2 characters
        }

        // Return 3 copies of the first two characters
        return firstTwo + firstTwo + firstTwo;
    }
}

