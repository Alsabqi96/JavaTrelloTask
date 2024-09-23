public class FindtheMostFrequentCharacter{
    public static void main(String[] args) {

        String str = "success";
        char result = mostFrequentChar(str);
        System.out.println("The most frequent character is: '" + result + "'");
    }

    public static char mostFrequentChar(String str) {

        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            frequency[c]++;
        }
        
        int maxFrequency = 0;
        char mostFrequent = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (frequency[c] > maxFrequency) {
                maxFrequency = frequency[c];
                mostFrequent = c;
            }
        }

        return mostFrequent;
    }
}



