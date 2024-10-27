public class StrDistFinder {
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat")); 
    }

    public static int strDist(String str, String sub) {
        // Base case: if the string is shorter than sub, return 0
        if (str.length() < sub.length()) {
            return 0;
        }

        // If str starts and ends with sub, return the length of str
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }

        // If str doesn't start with sub, remove the first character
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }

        // If str doesn't end with sub, remove the last character
        if (!str.endsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        }

        return 0;
    }
}

