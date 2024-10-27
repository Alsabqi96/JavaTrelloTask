public class AllStar {
    public static void main(String[] args) {
        System.out.println("allStar(\"hello\") → " + allStar("hello"));
        System.out.println("allStar(\"abc\") → " + allStar("abc"));
        System.out.println("allStar(\"ab\") → " + allStar("ab"));       
    }

    public static String allStar(String str) {
        // Base case: if string is empty or has only one character, return it as is
        if (str.length() == 0 || str.length() == 1) {
            return str;
        }
        // Recursive case: add '*' between characters
        return str.charAt(0) + "*" + allStar(str.substring(1));
    }
}

