package com.company.decompositionUsingMethods;

public class Task1 {

    public static void main(String[] args) {
        int numA = 45;
        int numB = 12;
        System.out.println("Наибольший общий делитель чисел " + numA + " и " + numB + " равен " + greatestCommonDivisor(numA, numB));
        System.out.println("Наименьшее общее кратное чисел " + numA + " и " + numB + " равно " + smallestCommonMultiple(numA, numB));
    }

    public static int greatestCommonDivisor(int numA, int numB) {
        int result = 1;
        int min = Math.min(numA, numB);
        for (int i = min; i > 0; i--) {
            if (numA % i == 0 && numB % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int smallestCommonMultiple(int numA, int numB) {
        int result = 1;
        int max = Math.max(numA, numB);
        for (int i = max; i <= numA * numB; i++) {
            if (i % numA == 0 && i % numB == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
