public class CountOccurances {

    public static void main(String[] args) {

        String str = "banana";
        String substr = "ana";
        int count = countOccurrences(str, substr);
        System.out.println("The substring '" + substr + "' appears " + count + " time(s) in '" + str + "'.");
    }

    public static int countOccurrences(String str, String substr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += 1;
        }

        return count;
    }
}

