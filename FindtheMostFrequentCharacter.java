import java.util.HashMap;
import java.util.Map;

public class FindtheMostFrequentCharacter {
    public static void main(String[] args) {

        String str = "success";
        char result = mostFrequentChar(str);
        System.out.println("The most frequent character is: '" + result + "'");
    }


    public static char mostFrequentChar(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequent = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequent = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequent;
    }
}

