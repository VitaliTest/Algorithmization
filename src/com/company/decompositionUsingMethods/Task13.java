package com.company.decompositionUsingMethods;

public class Task13 {

    public static void main(String[] args) {
        int number = 10;
        System.out.println("Пары чисел-близнецов на отрезке от " + number + " до " + 2 * number + ":");
        int[][] matrix = createAnArrayOfArrays(number);
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }

    public static int[] createAnArray(int number) {
        int[] array = new int[(2 * number - number) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = number + i;
        }
        return array;
    }

    public static int[][] createAnArrayOfArrays(int number) {
        int[][] matrix = new int[2 * number - number - 1][2];
        for (int i = 0; i < createAnArray(number).length - 2; i++) {
            matrix[i][0] = createAnArray(number)[i];
            matrix[i][1] = createAnArray(number)[i + 2];
        }
        return matrix;
    }
}
