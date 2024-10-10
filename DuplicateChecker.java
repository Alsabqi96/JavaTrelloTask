import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateChecker {
    public static void main(String[] args) {
        // Step 1: I create an ArrayList with some elements
        List<Integer> arrayListWithDuplicates = new ArrayList<>();
        arrayListWithDuplicates.add(1);
        arrayListWithDuplicates.add(2);
        arrayListWithDuplicates.add(3);
        arrayListWithDuplicates.add(1);

        // Step 2: I create a primitive array
        int[] arrayWithoutDuplicates = {1, 2, 3};

        // Step 3: I used this to check for duplicates in both the ArrayList and the array
        System.out.println("Contains duplicates in ArrayList: " + containsDuplicates(arrayListWithDuplicates));
        System.out.println("Contains duplicates in Array: " + containsDuplicates(arrayWithoutDuplicates));
    }

    // This is function to check if an ArrayList contains any duplicates
    public static boolean containsDuplicates(List<Integer> list) {
        Set<Integer> seenNumbers = new HashSet<>();

        // I write this to iterate through the ArrayList
        for (int num : list) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

    // This function to check if a primitive array contains any duplicates
    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> seenNumbers = new HashSet<>();

        // I use this to iterate through the array
        for (int num : arr) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}





