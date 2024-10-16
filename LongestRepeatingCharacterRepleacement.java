import java.util.HashMap;

public class LongestRepeatingCharacterRepleacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int result = characterReplacement(s, k);
        System.out.println("Longest substring length: " + result);

    }
    public static int characterReplacement(String s, int k){
        HashMap<Character, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            countMap.put(currentChar, countMap.getOrDefault(currentChar, 0) +1);
            maxCount = Math.max(maxCount, countMap.get(currentChar));

            if (right - left + 1 - maxCount > k) {
                countMap.put(s.charAt(left), countMap.get(s.charAt(left)) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
