import java.util.HashMap;
import java.util.Map;

public class MapShare {

    public static void main(String[] args) {
        // Initialize a single HashMap with initial key-value pairs
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "bbb");
        map.put("c", "ccc");

        // Print the original map contents
        System.out.println("Original map: " + map);

        // Modify the map according to the mapShare rules by calling the mapShare method
        mapShare(map);

        // Print the modified map after applying the mapShare changes
        System.out.println("Modified map: " + map);
    }

    // mapShare method to modify the given map based on specific rules
    public static Map<String, String> mapShare(Map<String, String> map) {
        // Check if the map contains a key "a"
        if (map.containsKey("a")) {
            // Set the value of key "b" to be the same as the value of key "a"
            map.put("b", map.get("a"));
        }
        // Remove the key "c" from the map if it exists
        map.remove("c");

        // Return the modified map
        return map;
    }
}
