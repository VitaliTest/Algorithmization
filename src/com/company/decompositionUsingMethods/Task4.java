package com.company.decompositionUsingMethods;

public class Task4 {

    public static void main(String[] args) {
        int numberPoints = 5;
        int min = -100;
        int max = 100;
        int[][] matrix = new int[numberPoints][2];
        System.out.println("Матрица координат точек: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * ((max - min) + 1) + min);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[] point = maxDistanceBetweenPoints(matrix);
        System.out.println("Наибольшее расстояние между точками №" + point[0] + "(" + matrix[point[0]][0] +
                "," + matrix[point[0]][1] + ") и №" + point[1] + "(" + matrix[point[1]][0] +
                "," + matrix[point[1]][1] + ")");
    }

    public static int[] maxDistanceBetweenPoints(int[][] matrix) {
        double maxDistance = Double.MIN_VALUE;
        int idFirstPoint = 0;
        int idSecondPoint = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length - 1; j++) {
                int distanceX = matrix[i][0] - matrix[j][0];
                int distanceY = matrix[i][1] - matrix[j][1];
                double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
                if (distance > maxDistance) {
                    maxDistance = distance;
                    idFirstPoint = i;
                    idSecondPoint = j;
                }
            }
        }
        return new int[]{idFirstPoint, idSecondPoint};
    }
}
