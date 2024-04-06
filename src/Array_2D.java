//WAP to transpose matrix of 2-D array


//Class name
public class Array_2D {

    //Main method
    public static void main(String[] args) {

        int[][] originalMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int rows = originalMatrix.length;
        int cols = originalMatrix[0].length;

        // Create a new matrix for the transposed result
        int[][] transposedMatrix = new int[cols][rows];

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = originalMatrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(originalMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
