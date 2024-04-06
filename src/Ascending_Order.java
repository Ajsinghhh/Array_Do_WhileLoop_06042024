//WAP to enter array and sort the values in ascending order


import java.util.Arrays;

//Class name
public class Ascending_Order {

    //Main Method
    public static void main(String[] args) {

        int[] array = {30, 25, 40, 12, 1, 3, 99, 37, 62};

        // Sort the array in ascending order
        Arrays.sort(array);

        System.out.println("Elements of array sorted in ascending order:");
        for (int num : array) {
            System.out.print(num + " ");
        }


    }
}
