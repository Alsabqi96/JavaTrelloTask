import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;

        // Use absolute value to handle negative numbers
        number = Math.abs(number);

        while (number > 0) {
            int digit = number % 10; // get last digit
            sum += digit;
            number /= 10; // remove last digit
        }
        System.out.println("The sum of the digits is: " + sum);
    }
}