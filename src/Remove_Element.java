// WAP to remove specific element from an array

import java.util.Arrays;

//Class name
public class Remove_Element {

    //Main method
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Index of the element to be removed
        int indexToRemove = 2;

        // Shift elements to the left to overwrite the element at the specified index
        for (int i = indexToRemove; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Create a new array with one less element
        int[] newArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArray, 0, newArray.length);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Resultant Array: " + Arrays.toString(newArray));


    }
}
