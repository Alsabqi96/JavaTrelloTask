import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WorldMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings separated by spaces: ");

        // Read the user input and split it into an array of strings
        String input = scanner.nextLine();
        String[] strings = input.split(" ");

        // Output the result
        System.out.println(countWords(strings));

        // Close the scanner to prevent resource leak
        scanner.close();
    }
    
    public static Map<String, Boolean> countWords(String[] strings) {
        // Map to store the count of each string
        Map<String, Integer> count = new HashMap<>();
        // Map to store the final result (string as key, boolean as value)
        Map<String, Boolean> result = new HashMap<>();

        // Count the occurrences of each string
        for (String str : strings) {
            count.put(str, count.getOrDefault(str, 0) + 1);
        }

        // Populate the result map: true if the string appears 2 or more times, false otherwise
        for (String key : count.keySet()) {
            result.put(key, count.get(key) >= 2);
        }

        return result;
    }
}
