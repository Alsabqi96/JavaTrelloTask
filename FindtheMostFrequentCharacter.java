public class FindtheMostFrequentCharacter {
    public static void main(String[] args) {
        // Test the method with the example input
        String str = "success";
        char result = mostFrequentChar(str);
        System.out.println("The most frequent character is: '" + result + "'");
    }

    // Method to find the most frequent character in the string
    public static char mostFrequentChar(String str) {
        // Array to store the frequency of characters (for ASCII values)
        int[] frequency = new int[256]; // Assumes input contains only ASCII characters

        // Loop through the string to count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++; // Increment the frequency count for this character
        }

        // Find the character with the highest frequency
        int maxFrequency = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (frequency[c] > maxFrequency) {
                maxFrequency = frequency[c];
                mostFrequent = c;
            }
        }

        return mostFrequent;
    }
}

