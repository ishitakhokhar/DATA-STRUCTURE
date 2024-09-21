// Read two matrices, first 3x2 and second 2x3, perform multiplication operation
// and store result in third matrix and print it.

import java.util.Scanner;

public class Maltiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows1 = 3;
        int cols1 = 2;
        int rows2 = 2;
        int cols2 = 3;
        int[][] firstMatrix = new int[rows1][cols1];
        int[][] secondMatrix = new int[rows2][cols2];
        int[][] resultMatrix = new int[rows1][cols2];
        System.out.println("Enter elements of the first 3x2 matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                firstMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of the second 2x3 matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                secondMatrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }

        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
        }

    }
}
