public class BunnyEars {
    public static void main(String[] args) {
        System.out.println("bunnyEars2(0) → " + bunnyEars2(0));
        System.out.println("bunnyEars2(1) → " + bunnyEars2(1));
        System.out.println("bunnyEars2(2) → " + bunnyEars2(2));
        System.out.println("bunnyEars2(3) → " + bunnyEars2(3));
        System.out.println("bunnyEars2(4) → " + bunnyEars2(4));
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 != 0) {
            return bunnyEars2(bunnies - 1) + 2;
        } else {
            return bunnyEars2(bunnies - 1) + 3;
        }
    }
}




