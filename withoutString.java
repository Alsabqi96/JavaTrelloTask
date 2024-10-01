public class withoutString {

    public static void main(String[] args){
        System.out.println(withoutString("Hello there", "llo")); // "He there"
        System.out.println(withoutString("Hello there", "e")); // "Hllo thr"
        System.out.println(withoutString("Hello there", "x")); // "Hello there"
    }

    public static String withoutString(String base, String remove){
        // Use regex with case-insensitivity to find and remove all instances of 'remove'
        return base.replaceAll("(?i)" + remove, "");
    }
}
