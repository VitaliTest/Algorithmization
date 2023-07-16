package com.company.decompositionUsingMethods;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        int num = 3005452;
        System.out.println("Массив из числа N = " + num + ": " + Arrays.toString(arrayOfNumbers(num)));
    }

    public static int[] arrayOfNumbers(int num) {
        char[] ch = Integer.toString(num).toCharArray();
        int[] array = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            array[i] = Character.getNumericValue(ch[i]);
        }
        return array;
    }
}
