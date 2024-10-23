import java.util.HashMap;
import java.util.Map;

public class MapValueTakingFromA {
    public static void main(String[] args) {

        // Initialize a map with character keys and string values
        Map<Character, String> lettersRepresentation = new HashMap<>();
        lettersRepresentation.put('n', "nnn");
        lettersRepresentation.put('b', "bbb");
        lettersRepresentation.put('c', "ccc");
        lettersRepresentation.put('a', "www");
        System.out.println("Map before modification: " + lettersRepresentation);

        // Call the method to update the map
        updateMapWithAValue(lettersRepresentation);
    }

    public static void updateMapWithAValue(Map<Character, String> lettersRepresentation) {
        // Check if both 'b' and 'a' exist in the map
        if (lettersRepresentation.containsKey('b') && lettersRepresentation.containsKey('a')) {
            // Set the value of 'b' to the value of 'a'
            lettersRepresentation.put('b', lettersRepresentation.get('a'));
            // Set the value of 'a' to an empty string
            lettersRepresentation.put('a', "");
            System.out.println("Map after modification: " + lettersRepresentation);
        } else {
            // If 'b' or 'a' doesn't exist in the map, no modification is made
            System.out.println("There is no modification");
        }
    }
}

