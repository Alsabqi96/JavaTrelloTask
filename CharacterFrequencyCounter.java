import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        Map<Character, Integer> vowelMap = new HashMap<>();
        Map<Character, Integer> consonantMap = new HashMap<>();
        String vowels = "aeiou";

        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (vowels.indexOf(ch) >= 0) {
                    vowelMap.put(ch, vowelMap.getOrDefault(ch, 0) + 1);
                } else {
                    consonantMap.put(ch, consonantMap.getOrDefault(ch, 0) + 1);
                }
            }
        }

        System.out.println("Vowel Frequencies: " + vowelMap);
        System.out.println("Consonant Frequencies: " + consonantMap);

        scanner.close();
    }
}

