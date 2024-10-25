import java.util.HashMap;
import java.util.Map;

public class WordLength {
    public static void main(String[] args) {
        //Test cases
        String[] array1 = {"a", "bb", "a", "bb"};
        String[] array2 = {"this", "and", "that", "and"};
        String[] array3 = {"code", "code", "code", "bug"};

        //Print the results of calling wordLen on each test array
        System.out.println("Test case 1: " + wordLen(array1));
        System.out.println("Test case 2: " + wordLen(array2));
        System.out.println("Test case 3: " + wordLen(array3));
    }

    //Method that takes an array of strings and returns a map with each string's length
    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();  // Create a new HashMap to store unique strings and their lengths
        for (String s : strings) {  // Iterate over each string in the input array
            map.put(s, s.length()); // Add the string as a key and its length as the value in the map
        }
        return map; // Return the map containing each unique string with its length
    }
}




