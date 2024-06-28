// Read two 2x2 matrices and perform addition of matrices into third matrix and
// print it

import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 2;
        int cols = 2;

        int[][] firstMatrix = new int[rows][cols];
        int[][] secondMatrix = new int[rows][cols];
        int[][] resultMatrix = new int[rows][cols];

        System.out.println("Enter elements of the first 2x2 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of the second 2x2 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
