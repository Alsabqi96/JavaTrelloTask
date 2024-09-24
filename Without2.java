public class Without2 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(without2("HelloHe"));  // Output: "lloHe"
        System.out.println(without2("HelloHi"));  // Output: "HelloHi"
        System.out.println(without2("Hi"));       // Output: ""
    }

    public static String without2(String str) {
        // If the string length is less than 2, return the string as is (or empty if it's exactly 2)
        if (str.length() < 2) {
            return str;
        }

        // Get the first 2 characters and last 2 characters of the string
        String start = str.substring(0, 2);
        String end = str.substring(str.length() - 2);

        // If the first and last 2 characters are the same, remove the first 2 characters
        if (start.equals(end)) {
            return str.substring(2);
        }

        // Otherwise, return the original string
        return str;
    }
}

