// Suppose you are senior developer for an Relational Database Management System
// named "Array Database" where everything is implemented using only array, today
// your task is to implement aggregate function like sum, min, max, avg. For simplicity,
// assume that your database can only store integers.

import java.util.Scanner;

public class ArrayDatabase {

    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public int min(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public double avg(int[] array) {
        double sum = 0;
        double avg = 0;
        for (double num : array) {
            sum += num;
            avg = sum / num;
        }
        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDatabase rdb = new ArrayDatabase();
        System.out.println("Enter number of elements : ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Sum : " + rdb.sum(array));
        System.out.println("min : " + rdb.min(array));
        System.out.println("max : " + rdb.max(array));
        System.out.println("avg : " + rdb.avg(array));
    }
}
