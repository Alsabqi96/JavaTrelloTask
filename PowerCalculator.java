import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PowerCalculator pc = new PowerCalculator();

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = pc.powerN(base, exponent);
        System.out.println("Result: " + base + " to the power of " + exponent + " is " + result);
    }

    public int powerN(int base, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return base;
        } else {
            return base * powerN(base, n - 1);
        }
    }
}
