public class LongestMirrorImage {
        public static void main(String[] args) {

            String str1 = "sdnhkds"; // original string
            String str2 = "sdkhnds"; // the mirror string
            mirrorEnds(str1, str2);

        }

        public static void mirrorEnds(String str1, String str2) {
            char[] letters1 = str1.toCharArray();
            char[] letters2 = str2.toCharArray();
            StringBuilder mirrorCharacters = new StringBuilder();
            for (int i = 0; i < letters1.length; i++) {
                if (letters1[i] == letters2[i]) {
                    mirrorCharacters.append(letters1[i]);
                } else {
                    break;
                }
            }
            System.out.println(mirrorCharacters);
        }
    }

