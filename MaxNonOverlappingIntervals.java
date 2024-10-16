import java.util.Arrays;

public class MaxNonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int maxCount = findMaxNonOverlappingIntervals(intervals);
        System.out.println("Maximum number of non-overlapping intervals: " + maxCount);
    }

    public static int findMaxNonOverlappingIntervals(int[][] intervals) {
        // If there are no intervals, return 0
        if (intervals.length == 0) return 0;

        // Sort intervals based on the end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        // Start with the first interval
        int count = 1;
        // Track the end time of the last added interval
        int end = intervals[0][1];

        // Loop through the remaining intervals
        for (int i = 1; i < intervals.length; i++) {
            // Check if the current interval starts after the last added interval ends
            if (intervals[i][0] >= end) {
                // Increase the count of non-overlapping intervals
                count++;
                // Increase the count of non-overlapping intervals
                end = intervals[i][1];
            }
        }
        // Return the maximum count of non-overlapping intervals
        return count;
    }
}
