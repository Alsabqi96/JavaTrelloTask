import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public static void main(String[] args) {
        String[] array1 = {"a", "b", "a", "b"};
        String[] array2 = {"a", "b", "a", "c", "b"};
        String[] array3 = {"c", "b", "a"};

        System.out.println("Test case 1: " + word0(array1));
        System.out.println("Test case 2: " + word0(array2));
        System.out.println("Test case 3: " + word0(array3));
    }

    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (String s : strings) {
            map.put(s, 0);
        }
        return map;
    }
}

