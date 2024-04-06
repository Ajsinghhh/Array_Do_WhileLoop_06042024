// WAP to input any number and find out if its Armstrong number or not

import java.util.Scanner;

//Class name
public class Armstrong_Number {

//MAin method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Validate if it's a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

       //Calculate the number of digits
        int originalNumber = number;
        int numDigits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            numDigits++;
        }

        // Calculate the sum of digits raised to the power of numDigits
        originalNumber = number;
        int sum = 0;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numDigits);
            originalNumber /= 10;
        }

        // Check if it's an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

    }
}
