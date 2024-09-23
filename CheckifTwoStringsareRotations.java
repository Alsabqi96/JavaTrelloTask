public class CheckifTwoStringsareRotations {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "dabc";
        boolean result = areRotations(str1, str2);
        System.out.println("Are '" + str1 + "' and '" + str2 + "' rotations of each other? " + result);
    }


    public static boolean areRotations(String str1, String str2) {

        if (str1.length() == str2.length() && str1.length() > 0) {

            String combined = str1 + str1;

            return combined.contains(str2);
        }
        return false;
    }
}

