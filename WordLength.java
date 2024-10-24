import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strings separated by spaces:");

        // Here i put Input example: a b a b
        String input = scanner.nextLine();

        // Split the input into an array of strings
        String[] strings = input.split("\\s+");

        // Get the result map and print it
        Map<String, Integer> result = wordLen(strings);
        System.out.println("Result: " + result);

        // Close the scanner to avoid resource leak
        scanner.close();
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            // Directly put the string and its length in the map
            result.put(str, str.length());
        }
        return result;
    }
}
