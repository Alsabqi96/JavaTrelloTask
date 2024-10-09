import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementExtractor {

    // First I put example input array
    // I use a function to get unique elements
    // I display the result
    // I write function to extract unique elements from an array
    // I use a set to filter out duplicate elements
    // After that I add each element of the array to the set
    // Final step is to convert the set to a list and return it

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 1};
        List<Integer> uniqueElements = getUniqueElements(inputArray);
        System.out.println("Unique elements: " + uniqueElements);
    }

    public static List<Integer> getUniqueElements(int[] arr) {
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }

        return new ArrayList<>(uniqueSet);
    }
}
