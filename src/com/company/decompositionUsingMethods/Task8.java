package com.company.decompositionUsingMethods;

import java.util.Arrays;

public class Task8 {

    public static void main(String[] args) {
        int numK = 5;
        int numM = 9;
        int[] arrayD = createAnArray(numM);
        System.out.println("Исходный массив случайных чисел: " + Arrays.toString(arrayD));
        int[] arraySum = anArrayOfAmounts(numK, numM, arrayD);
        System.out.println("Сумма трех последовательно расположенных элементов с номерами от " + numK + " до " + numM + ": ");
        for (int j : arraySum) {
            System.out.println("[" + numK + "," + (numK + 1) + "," + (numK + 2) + "]: " + j);
            numK++;
        }
    }

    public static int[] createAnArray(int numM) {
        int[] array = new int[numM + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((100 + 100) + 1) - 100);
        }
        return array;
    }

    public static int sumOfThreeElements(int numK, int[] array) {
        return array[numK] + array[numK + 1] + array[numK + 2];
    }

    public static int[] anArrayOfAmounts(int numK, int numM, int[] array) {
        int[] arraySum = new int[(numM - numK) - 1];
        int j = 0;
        for (int i = numK; i < numM - 1; i++) {
            arraySum[j] = sumOfThreeElements(i, array);
            j++;
        }
        return arraySum;
    }
}
