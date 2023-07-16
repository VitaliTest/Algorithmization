package com.company.decompositionUsingMethods;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        int numElements = 20;
        int min = 0;
        int max = 100;
        int[] array = new int[numElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((max - min) + 1) + min);
        }
        System.out.println("Массив чисел: " + Arrays.toString(array));
        System.out.println("Второе по величине число из массива - " + secondMax(array));
    }

    public static int secondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        for (int j : array) {
            if (j > secondMax && j != max) {
                secondMax = j;
            }
        }
        return secondMax;
    }
}
