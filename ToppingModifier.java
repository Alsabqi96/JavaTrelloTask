import java.util.HashMap;
import java.util.Map;

public class ToppingModifier {
    public static void main(String[] args){
        // Create a map and add a key-value pair for "ice cream"
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "peanuts");

        // Call the method to update the toppings map
        updateToppingsMap(map);

        // Print the modified map
        System.out.println(map);
    }

    // Method to update the toppings map
    public static void updateToppingsMap(Map<String, String> map){
        // If the map contains "ice cream", set its value to "cherry"
        if (map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }

        // Add a new key "bread" with the value "butter"
        map.put("bread", "butter");
    }
}


