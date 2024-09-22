public class LongestWordinaSentance {
    public static void main(String[] args) {

        String sentence = "The quick brown fox jumped over the lazy dog";
        String longest = longestWord(sentence);
        System.out.println("The longest word is: " + longest);
    }

    public static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
