import java.util.HashMap;
import java.util.Map;

public class FirstChar {
    public static void main(String[] args) {
        String[] array1 = {"salt", "tea", "soda", "toast"};
        String[] array2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        String[] array3 = {};

        System.out.println("Test case 1: " + firstChar(array1));
        System.out.println("Test case 2: " + firstChar(array2));
        System.out.println("Test case 3: " + firstChar(array3));
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            String key = s.charAt(0) + "";
            if (map.containsKey(key)) {
                String value = map.get(key) + s;
                map.put(key, value);
            } else {
                map.put(key, s);
            }
        }
        return map;
    }
}

