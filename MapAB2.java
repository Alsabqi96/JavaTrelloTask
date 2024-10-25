import java.util.HashMap;
import java.util.Map;

public class MapAB2 {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");

        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        map3.put("c", "aaa");

        System.out.println("Test case 1: " + mapAB2(map1));
        System.out.println("Test case 2: " + mapAB2(map2));
        System.out.println("Test case 3: " + mapAB2(map3));
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        if (map.get("a") != null && map.get("b") != null) {
            if (map.get("a").equals(map.get("b"))) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}

