import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DisjointChecker {

    public static void main(String[] args) {
        // I Create example Input 1
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Using this to Check if the two lists are disjoint
        boolean areDisjoint1 = areDisjoint(list1, list2);
        System.out.println("Are the lists disjoint? " + areDisjoint1);

        // I create Example Input 2
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        List<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(4);
        list4.add(5);

        // Check if the two lists are disjoint
        boolean areDisjoint2 = areDisjoint(list3, list4);
        System.out.println("Are the lists disjoint? " + areDisjoint2);
    }


     // Function to check if two ArrayLists are disjoint.

    public static boolean areDisjoint(List<Integer> list1, List<Integer> list2) {
        // Convert the first list to a set for fast lookups
        Set<Integer> set = new HashSet<>(list1);

        // Check if any element of the second list is present in the set
        for (int num : list2) {
            if (set.contains(num)) {
                return false; // Found a common element, so they are not disjoint
            }
        }

        // If no common elements are found, the lists are disjoint
        return true;
    }
}
