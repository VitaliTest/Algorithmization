package com.company.decompositionUsingMethods;

public class Task14 {

    public static void main(String[] args) {
        int numK = 10000;
        System.out.print("Список чисел Армстронга от 1 до " + numK + ": ");
        for (int i = 1; i < numK; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == i) {
                System.out.print(i + ", ");
            }
        }
    }

    public static int[] arrayOfNumbers(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    public static int sumOfOddNumbers(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + (int) Math.pow(j, array.length);
        }
        return sum;
    }
}
