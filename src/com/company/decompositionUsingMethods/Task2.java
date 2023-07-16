package com.company.decompositionUsingMethods;

public class Task2 {

    public static void main(String[] args) {
        int numA = 24, numB = 9, numC = 15, numD = 3;
        System.out.println("Наибольший общий делитель чисел " + numA + ", " + numB + ", " + numC + ", " + numD + " равно " + greatestCommonDivisor(numA, numB, numC, numD));
    }
    public static int greatestCommonDivisor(int numA, int numB, int numC, int numD) {
        int result = 1;
        int min = Math.min(Math.min(numA, numB), Math.min(numC, numD));
        for (int i = min; i > 0; i--) {
            if (numA % i == 0 && numB % i == 0 && numC % i == 0 && numD % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
