import java.util.HashMap;
import java.util.Map;

public class MapAB {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");

        System.out.println("Test case 1: " + mapAB(map1));
        System.out.println("Test case 2: " + mapAB(map2));
        System.out.println("Test case 3: " + mapAB(map3));
    }

    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}

