//Write a Java program to find the common elements between two arrays (string values)

//Class name
public class Common_Elements {

    //Main method
    public static void main(String[] args) {

        String[] arr1 = {"Mercedes", "Porsche", "Ferrari", "Audi", "Lamborghini"};
        String[] arr2 = {"BMW", "Tesla", "Ferrari", "Audi"};

        // Find common elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    System.out.println("Common element: " + arr1[i]);

                    // No need to continue checking for this element
                    break;
                }
            }
        }

    }
}
