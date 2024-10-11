import java.util.*;
public class CommonCharactersInStrings {
    public static void main(String[] args) {

        // I used this to define two strings
        String firstWord = "hello";
        String secondWord = "world";

        // I used it to find common characters directly
        findCommonCharacters(firstWord, secondWord);
    }

    // This method to find common characters between two strings
    public static void findCommonCharacters(String firstWord, String secondWord) {
        //This to convert strings into lists of characters
        List<Character> firstList = new ArrayList<>();
        for (char c : firstWord.toCharArray()) {
            firstList.add(c);
        }

        List<Character> secondList = new ArrayList<>();
        for (char c : secondWord.toCharArray()) {
            secondList.add(c);
        }

        // Use a set to find common characters
        Set<Character> commonCharacters = new HashSet<>(firstList);
        commonCharacters.retainAll(secondList);

        // Print the common characters
        System.out.println("Common characters: " + commonCharacters);
    }
}
