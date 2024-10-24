import java.util.HashMap;
import java.util.Map;
public class MapValueTakingFromA {
    public static void main(String[] args) {
        // Example usage of the mapBully method
        Map<String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");

        System.out.println("Original map: " + map);

        // Modify the map using mapBully
        Map<String, String> modifiedMap = mapBully(map);

        // Display the modified map
        System.out.println("Modified map: " + modifiedMap);
    }

    // Method to modify the map as specified
    public static Map<String, String> mapBully(Map<String, String> map) {
        // Check if the key "a" exists in the map
        if (map.containsKey("a")) {
            // Transfer the value from "a" to "b"
            map.put("b", map.get("a"));
            // Clear the value of "a"
            map.put("a", "");  
        }

        //Use this to Return the modified map
        return map;
    }


    }

