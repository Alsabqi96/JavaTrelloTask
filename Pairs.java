import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {
        String[] array1 = {"code", "bug"};
        String[] array2 = {"man", "moon", "main"};
        String[] array3 = {"man", "moon", "good", "night"};

        System.out.println("Test case 1: " + pairs(array1));
        System.out.println("Test case 2: " + pairs(array2));
        System.out.println("Test case 3: " + pairs(array3));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
        }
        return map;
    }
}


