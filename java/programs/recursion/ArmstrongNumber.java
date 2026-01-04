import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int sum = 0;
        int numberOfDigits = 0;

        // Count the number of digits
        int tempNum = num;
        while (tempNum != 0) {
            tempNum /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of digits raised to the power of numberOfDigits
        tempNum = num; // Reset tempNum to the original number
        while (tempNum != 0) {
            int digit = tempNum % 10;
            sum += Math.pow(digit, numberOfDigits);
            tempNum /= 10;
        }

        // Check if it's an Armstrong number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
    

