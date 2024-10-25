import java.util.HashMap;
import java.util.Map;

public class MapAB4 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        map2.put("c", "cake");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aa");
        map3.put("b", "bbb");

        System.out.println("Test case 1: " + mapAB4(map1));
        System.out.println("Test case 2: " + mapAB4(map2));
        System.out.println("Test case 3: " + mapAB4(map3));
    }

    public static Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("c", map.get("a"));
        } else if (map.containsKey("b")) {
            map.put("c", map.get("b"));
        }
        return map;
    }
}

