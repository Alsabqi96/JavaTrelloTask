import java.util.HashSet;
import java.util.Set;


public class DuplicateChecker {
    public static void main(String[] args) {

        // First I put inputs array
        int[] arrayWithDuplicates = {1, 2, 3, 1};
        int[] arrayWithoutDuplicates = {1, 2, 3};
        // After that I check for duplicates in both arrays
        System.out.println("Contains duplicates: " + containsDuplicates(arrayWithDuplicates));
        System.out.println("Contains duplicates: " + containsDuplicates(arrayWithoutDuplicates));

    }

    // I write  function to check if an array contains any duplicates
    public static boolean containsDuplicates(int[] arr) {
        Set<Integer> seenNumbers = new HashSet<>();

        // I write function to iterate through the array
        for (int num : arr) {
            if (seenNumbers.contains(num)) {
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }
}




