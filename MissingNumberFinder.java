import java.util.ArrayList;
import java.util.List;
public class MissingNumberFinder {
    public static void main(String[] args) {
        // I Create example Input
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(0);
        list.add(1);

        // This use to find the missing number using an ArrayList
        int missingNumber = findMissingNumber(list);

        // Here i Display the result
        System.out.println("The missing number is: " + missingNumber); 
    }

    /*
     * Function to find the missing number from the list.
     */
    public static int findMissingNumber(List<Integer> list) {
        // Step 1: Calculate the sum of numbers from 0 to n
        int n = list.size();
        int totalSum = n * (n + 1) / 2;

        // Step 2: Find the sum of elements in the ArrayList
        int listSum = 0;
        for (int num : list) {
            listSum += num;
        }

        // Step 3: Calculate the missing number
        return totalSum - listSum;
    }
}

