// Write a Java program to test the equality of two arrays

import java.util.Arrays;

// Class NAme
public class Equality_Of_Two_Arrays {

    //Main Method
    public static void main(String[] args) {


//initialization and declaration
        int[] a = {10, 44, 28};
        int[] b = {60, 99, 57};

        // Check if the arrays are equal using Arrays.equals()
        boolean result = Arrays.equals(a, b);

        if (result) {
            System.out.println("Two arrays are equal");
        } else {
            System.out.println("Two arrays are not equal");
        }

    }
}
