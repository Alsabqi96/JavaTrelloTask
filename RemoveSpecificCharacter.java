public class RemoveSpecificCharacter {
    public static void main(String[] args) {

        String str = "hello world";
        char ch = 'l';
        String result = removeCharacter(str, ch);
        System.out.println("Result after removing '" + ch + "': " + result);
    }


    public static String removeCharacter(String str, char ch) {

        return str.replace(Character.toString(ch), "");
    }
}

