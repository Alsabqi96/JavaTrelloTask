import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsNearbyDuplicateArrayList {

    public static void main(String[] args) {
        // I create example input list
        List<Integer> nums = List.of(1, 2, 3, 1);
        //  I create example value of k
        int k = 3;

        boolean hasNearbyDuplicate = containsNearbyDuplicate(nums, k);

        System.out.println("Does the list contain nearby duplicates within k distance? " + hasNearbyDuplicate);
    }

    public static boolean containsNearbyDuplicate(List<Integer> nums, int k) {
        // This is to set tore seen elements
        Set<Integer> seen = new HashSet<>();

        // This for iterate through the list
        for (int i = 0; i < nums.size(); i++) {
            // I used this to  check if the current element is already in the set
            if (seen.contains(nums.get(i))) {
                return true;
            }

            // I used this to  add current element to the set
            seen.add(nums.get(i));

            //  This for maintain the window size to at most k
            if (seen.size() > k) {
                seen.remove(nums.get(i - k));
            }
        }

        return false;
    }
}
