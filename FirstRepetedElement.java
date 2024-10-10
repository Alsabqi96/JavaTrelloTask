import java.util.ArrayList;
import java.util.List;

public class FirstRepetedElement {

    public static void main(String[] args) {
        // I put example input array
        int[] numbers = {2, 5, 1, 2, 3};

        // I find the first duplicate
        int firstDuplicate = findFirstDuplicate(numbers);

        // This is to display the result
        if (firstDuplicate != -1) {
            System.out.println("The first duplicate is: " + firstDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }

    // This is the function to find the first duplicate in an array using List (ArrayList)
    public static int findFirstDuplicate(int[] arr) {
        List<Integer> seenNumbers = new ArrayList<>();

        // I create Loop through the array
        for (int num : arr) {
            // This to  check if the number is already in the list
            if (seenNumbers.contains(num)) {
                return num;  
            }
            // Otherwise, add the number to the list
            seenNumbers.add(num);
        }

        // If no duplicates are found, return -1
        return -1;
    }
}
