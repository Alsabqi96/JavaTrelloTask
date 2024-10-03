public class RoundSum {

    public static void main(String[] args) {

        System.out.println(roundSum(16, 17, 18));
        System.out.println(roundSum(12, 13, 14));
        System.out.println(roundSum(6, 4, 4));
    }

    //Returns the sum of the rounded values of a, b, and c.
    //Each number is rounded to the nearest multiple of 10.

    public static int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    //Rounds an integer to the nearest multiple of 10.
    //If the rightmost digit is 5 or more, rounds up to the next multiple of 10.
    //If the rightmost digit is less than 5, rounds down to the previous multiple of 10.


    public static int round10(int num) {
        int remainder = num % 10;

        if (remainder >= 5) {
            return num + (10 - remainder);
        } else {
            return num - remainder;
        }
    }
}