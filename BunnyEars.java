public class BunnyEars {
    public static void main(String[] args) {
        BunnyEars be = new BunnyEars();
        System.out.println("bunnyEars2(0) → " + be.bunnyEars2(0));
        System.out.println("bunnyEars2(1) → " + be.bunnyEars2(1));
        System.out.println("bunnyEars2(2) → " + be.bunnyEars2(2));

    }
    
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else if (bunnies == 1) {
            return 2;
        } else if (bunnies == 2) {
            return 5;
        } else if (bunnies % 2 != 0) {
            return bunnyEars2(bunnies - 1) + 2;
        } else {
            return bunnyEars2(bunnies - 1) + 3;
        }
    }
}



