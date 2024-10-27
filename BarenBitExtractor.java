public class BarenBitExtractor {
    public static void main(String[] args) {
        System.out.println("parenBit(\"xyz(abc)123\") → " + parenBit("xyz(abc)123"));
        System.out.println("parenBit(\"x(hello)\") → " + parenBit("x(hello)"));
        System.out.println("parenBit(\"(xy)1\") → " + parenBit("(xy)1"));
    }

    public static String parenBit(String str) {
        // Base case: if str is less than 3 characters, return as is
        if (str.length() < 3) return str;

        // If the first character is not '(', remove it and continue recursively
        if (str.charAt(0) != '(') {
            return parenBit(str.substring(1));
        }
        // If the last character is not ')', remove it from the end and continue recursively
        if (str.charAt(str.length() - 1) != ')') {
            return parenBit(str.substring(0, str.length() - 1));
        }

        // Return the string when it starts with '(' and ends with ')'
        return str;
    }
}
