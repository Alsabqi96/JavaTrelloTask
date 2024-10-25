import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "a"};
        String[] array2 = {"a", "b", "a", "c", "a", "d", "a"};
        String[] array3 = {"a", "", "a"};

        System.out.println("Test case 1: " + wordAppend(array1));
        System.out.println("Test case 2: " + wordAppend(array2));
        System.out.println("Test case 3: " + wordAppend(array3));
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap();
        String string = "";

        for (String s : strings) {
            String key = s;

            if (map.containsKey(key)) {
                int value = map.get(key);
                value++;
                if (value % 2 == 0)
                    string += key;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }
        return string;
    }
}

