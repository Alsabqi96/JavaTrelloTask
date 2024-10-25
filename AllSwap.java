import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public static void main(String[] args) {
        // Test case arrays
        String[] array1 = {"ab", "ac"};
        String[] array2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] array3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        // Print the results of allSwap for each test case
        System.out.println( "Test case 1: " + java.util.Arrays.toString(allSwap(array1)));
        System.out.println("Test case 2: " + java.util.Arrays.toString(allSwap(array2)));
        System.out.println("Test case 3: " + java.util.Arrays.toString(allSwap(array3)));
    }

    // Method to swap strings based on the first character
    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].charAt(0) + "";
            if (map.containsKey(key)) {
                String temp = strings[i];
                strings[i] = strings[map.get(key)];
                strings[map.get(key)] = temp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}
