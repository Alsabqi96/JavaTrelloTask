public class firstRepeatedChar{
    public static void main(String[] args) {
        // Test the method with the example input
        String str = "swiss";
        Character result = firstRepeatedChar(str);
        if (result != null) {
            System.out.println("The first repeated character is: '" + result + "'");
        } else {
            System.out.println("No repeated characters found.");
        }
    }

    // Method to find the first repeated character in the string
    public static Character firstRepeatedChar(String str) {
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            // Check if the current character appears again later in the string
            for (int j = i + 1; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    return current; // Return the first repeated character
                }
            }
        }

        // Return null if no repeated character is found
        return null;
    }
}
