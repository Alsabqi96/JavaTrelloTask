import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListIntersection {

    public static void main(String[] args) {
        // Step 1: I create the first list with some numbers
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        // Step 2: I create the second list with some numbers
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(2);

        // Step 3: Use this to find the intersection of the two lists
        List<Integer> intersection = findIntersection(list1, list2);

        // Step 4:This for display the result
        System.out.println("Intersection: " + intersection);
    }

    /*
     * This function finds the intersection of two lists.
     * It returns a new list that contains elements found in both input lists.
     */
    public static List<Integer> findIntersection(List<Integer> list1, List<Integer> list2) {
        // Create a set from the first list to remove duplicates
        Set<Integer> set1 = new HashSet<>(list1);

        // Create a set to store the intersection
        Set<Integer> intersectionSet = new HashSet<>();

        // Check each element in the second list
        for (int num : list2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersection set to a list and return it
        return new ArrayList<>(intersectionSet);
    }
}
