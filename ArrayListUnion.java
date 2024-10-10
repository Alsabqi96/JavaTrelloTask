import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListUnion {

    public static void main(String[] args) {
        // Step 1: I create the first list with some numbers
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        // Step 2: I create the second list with some numbers
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(4);

        // Step 3: I used this to find the union of the two lists (all unique elements)
        List<Integer> union = findUnion(list1, list2);

        // Step 4: This for display the result
        System.out.println("Union of the two lists: " + union);
    }

    /*
     * This function finds the union of two lists.
     * It returns a new list that contains all unique elements from both input lists.
     */
    public static List<Integer> findUnion(List<Integer> list1, List<Integer> list2) {
        // I create a new list to hold all elements from both lists
        List<Integer> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);

        // I used a set to remove any duplicates
        Set<Integer> uniqueSet = new HashSet<>(combinedList);

        // I  Converted the set back to a list and return it
        return new ArrayList<>(uniqueSet);
    }
}

