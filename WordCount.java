import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "a", "c", "b"};
        String[] array2 = {"c", "b", "a"};
        String[] array3 = {"c", "c", "c", "c"};

        System.out.println("Test case 1: " + wordCount(array1));
        System.out.println("Test case 2: " + wordCount(array2));
        System.out.println("Test case 3: " + wordCount(array3));
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            String tmp = s;
            if (map.containsKey(tmp)) {
                int count = map.get(tmp);
                map.put(tmp, count + 1);
            } else {
                map.put(tmp, 1);
            }
        }
        return map;
    }
}

