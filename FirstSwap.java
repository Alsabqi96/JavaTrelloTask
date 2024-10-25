import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public static void main(String[] args) {
        String[] array1 = {"ab", "ac"};
        String[] array2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] array3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};

        System.out.println("Test case 1: " + java.util.Arrays.toString(firstSwap(array1)));
        System.out.println("Test case 2: " + java.util.Arrays.toString(firstSwap(array2)));
        System.out.println("Test case 3: " + java.util.Arrays.toString(firstSwap(array3)));
    }

    public static String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String string = String.valueOf(strings[i].charAt(0));
            if (map.containsKey(string)) {
                int value = map.get(string);
                if (value == -1)
                    continue;
                int pos = map.get(string);
                String temp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = temp;
                map.put(string, -1);
            } else {
                map.put(string, i);
            }
        }
        return strings;
    }
}

