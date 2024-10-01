public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is test")); // "is not test"
        System.out.println(notReplace("is-is")); // "is not-is not"
        System.out.println(notReplace("This is right")); // "This is not right"
    }

    public static String notReplace(String str) {
        // Use regex to find standalone "is" and replace it with "is not"
        return str.replaceAll("(?i)\\bis\\b", "is not");
    }
    
}
