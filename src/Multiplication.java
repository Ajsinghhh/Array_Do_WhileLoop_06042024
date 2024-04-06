/*wap in java to print multiplication table using do while loop
1 2 3
2 4 6
3 6 9 */

//Class name
public class Multiplication {

    //Main method
    public static void main(String[] args) {

        // Starting number for the table
        int num = 1;

        // Number of rows and columns in the table
        int limit = 3;

// use of do while loop

        do {
            int multiplier = 1;
            do {
                System.out.print(num * multiplier + " ");
                multiplier++;
            } while (multiplier <= limit);
            System.out.println();
            num++;
        } while (num <= limit);

    }
}
