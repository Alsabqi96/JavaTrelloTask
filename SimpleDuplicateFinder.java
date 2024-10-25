import java.util.*;

public class SimpleDuplicateFinder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 6, 4, 3, 7, 3};

        Map<Integer, List<Integer>> positionMap = new HashMap<>();
        Set<Integer> duplicates = new HashSet<>();
        int sumOfDistinctDuplicates = 0;

        // Track positions of each element
        for (int i = 0; i < arr.length; i++) {
            positionMap.putIfAbsent(arr[i], new ArrayList<>());
            positionMap.get(arr[i]).add(i);
        }

        // Identify duplicates and calculate sum of distinct duplicates
        for (int num : positionMap.keySet()) {
            List<Integer> positions = positionMap.get(num);
            if (positions.size() > 1) {
                duplicates.add(num);
                System.out.println(num + ": Occurs " + positions.size() + " times at positions " + positions);
            }
        }

        // Sum of distinct duplicates
        for (int num : duplicates) {
            sumOfDistinctDuplicates += num;
        }

        System.out.println("Sum of distinct duplicate numbers: " + sumOfDistinctDuplicates);
    }
}

