import java.util.Arrays;

public class ArraywitheSeriesPattern {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(seriesUp(3))); // [1, 1, 2, 1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4))); // [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2))); // [1, 1, 2]
    }

    public static int[] seriesUp(int n) {
        // Calculate the length of the result array
        int size = n * (n + 1) / 2;
        int[] result = new int[size];

        int index = 0;

        // Build the array with the series pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result[index] = j;
                index++;
            }
        }

        return result;
    }
}


