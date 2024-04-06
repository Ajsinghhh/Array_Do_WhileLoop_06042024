//WAP to input the 5-digit number and then reverse it

import java.util.Scanner;

//Class name
public class Reverse_Number {

    // Main method
    public static void main(String[] args) {

        //object for scanner class
        Scanner scanner = new Scanner(System.in);

        // Input a 5-digit number
        System.out.print("Enter a 5-digit number: ");
        int originalNumber = scanner.nextInt();

        // Validate if it's a 5-digit number
        if (originalNumber < 10000 || originalNumber > 99999) {
            System.out.println("Please enter a valid 5-digit number.");
            return;
        }

        // Reverse the number using a do-while loop
        int reversedNumber = 0;
        int temp = originalNumber;
        do {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        } while (temp != 0);

        System.out.println("Reversed number: " + reversedNumber);

    }
}
