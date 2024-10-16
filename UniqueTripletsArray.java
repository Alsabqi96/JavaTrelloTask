
import java.util.*;

    public class UniqueTripletsArray {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(-1, 0, 1, 2, -1, -4);
            Set<List<Integer>> setOfTriplets = new HashSet<>();

            // I Iterate over the array to find triplets
            for (int i = 0; i < numbers.size() - 2; i++) {
                for (int j = i + 1; j < numbers.size() - 1; j++) {
                    for (int k = j + 1; k < numbers.size(); k++) {
                        // Check if the sum of three distinct elements is zero
                        if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 0) {
                            // Create a list with the triplet and sort it to maintain unique sets
                            List<Integer> triplet = Arrays.asList(numbers.get(i), numbers.get(j), numbers.get(k));
                            Collections.sort(triplet);
                            setOfTriplets.add(triplet);  // Set ensures only unique triplets are added
                        }
                    }
                }
            }

            // Output the unique triplets
            System.out.println(setOfTriplets);
        }
    }


