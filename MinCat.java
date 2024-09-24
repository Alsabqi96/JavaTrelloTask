public class MinCat {

    public static void main(String[] args) {
        // Test cases
        System.out.println(minCat("Hello", "Hi"));     // Output: "loHi"
        System.out.println(minCat("Hello", "java"));   // Output: "ellojava"
        System.out.println(minCat("java", "Hello"));   // Output: "javaello"
    }

    // Method to concatenate two strings, trimming the longer one if necessary
    public static String minCat(String str1, String str2) {
        // Find the minimum length of the two strings
        int minLength = Math.min(str1.length(), str2.length());

        // Trim both strings to the same length as the shorter one
        String trimmedStr1 = str1.substring(str1.length() - minLength);
        String trimmedStr2 = str2.substring(str2.length() - minLength);

        // Concatenate the trimmed strings and return the result
        return trimmedStr1 + trimmedStr2;
    }
}

