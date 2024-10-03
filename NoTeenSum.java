public class NoTeenSum {

    public static void main(String[] args){
        System.out.println(noTeenSum(1, 2, 3)); // 6
        System.out.println(noTeenSum(2, 13, 1)); // 3
        System.out.println(noTeenSum(2, 1, 14)); // 3

    }

    public static int noTeenSum(int a,int b,int c){
        // Use fixTeen to adjust each value and then return their sum
        return fixTeen(a) + fixTeen(b) + fixTeen(c);

    }
    public static int fixTeen(int n){
        // If n is a teen (13-19), except for 15 and 16, return 0
        if (n >= 13 && n <= 19 && n != 15 && n != 16){
            return 0;
        }
        return n;

    }

}
