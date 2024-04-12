package lecture1.ads3;

public class ads7  {

    public static void printSpiralSquare(int n, int currentNum, int[][] matrix) {
        if (n <= 0) {
            return; // Base case: nothing to print
        }

        // Top row (left to right)
        for (int i = n - 1; i >= 0; i--) {
            matrix[0][i] = currentNum++;
        }

        // Right column (top to bottom)
        for (int i = 1; i < n; i++) {
            matrix[i][0] = currentNum++;
        }

        // Recursive call for the inner square
        printSpiralSquare(n - 2, currentNum, matrix);

        // Bottom row (right to left) - only if n > 1
        if (n > 1) {
            for (int i = 1; i < n; i++) {
                matrix[n - 1][i] = currentNum++;
            }
        }

        // Left column (bottom to top) - only if n > 1
        if (n > 1) {
            for (int i = n - 2; i > 0; i--) {
                matrix[i][n - 1] = currentNum++;
            }
        }
    }

    public static void main(String[] args) {
        int n = 4; // Size of the square
        int[][] matrix = new int[n][n];
        printSpiralSquare(n, 1, matrix);

        // Print the matrix
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

