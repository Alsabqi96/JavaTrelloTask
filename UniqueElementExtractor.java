import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElementExtractor {

    public static void main(String[] args) {

        List<Integer> inputList = new ArrayList<>(); // First I put inputs ArrayList
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(2);
        inputList.add(1);


        List<Integer> uniqueElements = getUniqueElements(inputList); // I write a function to get a Unique Elements
        System.out.println("Unique elements: " + uniqueElements); // This is Function to Display the Result
    }

    // Function to extract unique elements from a list
    public static List<Integer> getUniqueElements(List<Integer> list) {
        // Use a Set to filter out duplicate elements
        Set<Integer> uniqueSet = new HashSet<>(list);

        // Convert the set back to a list and return
        return new ArrayList<>(uniqueSet);
    }
}
