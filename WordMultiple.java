import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static void main(String[] args) {
        // Test case arrays
        String[] array1 = {"a", "b", "a", "c", "b"};
        String[] array2 = {"c", "b", "a"};
        String[] array3 = {"c", "c", "c", "c"};

        // Print the results of wordMultiple for each test case
        System.out.println("Test case 1: " + wordMultiple(array1));
        System.out.println("Test case 2: " + wordMultiple(array2));
        System.out.println("Test case 3: " + wordMultiple(array3));
    }

    // Method that returns a map indicating if each string appears multiple times
    public static Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Integer> stringCount = new HashMap<>(); // Map to count occurrences of each string
        Map<String, Boolean> map = new HashMap<>(); // Map to store the result

        for (String s : strings) { // Iterate over each string in the input array
            String key = s; // Use the string as the key
            if (stringCount.containsKey(key)) {  // Check if the string has already been counted
                int count = stringCount.get(key); // Get the current count
                count++; // Increment the count
                stringCount.put(key, count); // Update the count in the map
            } else {
                stringCount.put(key, 1); // Initialize the count to 1 if it's the first occurrence
            }
            map.put(key, stringCount.get(key) >= 2);  // Update the result map to indicate if the string appears multiple times
        }
        return map; // Return the result map
    }
}
