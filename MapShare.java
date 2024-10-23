import java.util.HashMap;
import java.util.Map;

public class MapShare {

    public static void main(String[] args) {
        // Test case 1
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println(mapShare(map1));

        // Test case 2
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        System.out.println(mapShare(map2));

        // Test case 3
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        System.out.println(mapShare(map3)); 
    }

    public static Map<String, String> mapShare(Map<String, String> map) {
        // If key "a" has a value, set key "b" to the same value as "a"
        if (map.containsKey("a") && map.get("a") != null) {
            map.put("b", map.get("a"));
        }

        // Remove key "c" from the map
        map.remove("c");

        // Return the modified map
        return map;
    }
}
