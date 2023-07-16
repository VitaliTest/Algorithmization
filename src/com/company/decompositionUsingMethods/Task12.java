package com.company.decompositionUsingMethods;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        int numK = 11;
        int numN = 100;
        int[] array = newArray(numN, numK);
        System.out.println("При K = " + numK + " и N = " + numN + ", массив чисел будет выглядеть так: " + Arrays.toString(array));
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
            sum = sum + j;
        }
        return sum;
    }

    public static int lengthArray(int numN, int numK) {
        int length = 0;
        for (int i = 0; i <= numN; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == numK) {
                length++;
            }
        }
        return length;
    }

    public static int[] newArray(int numN, int numK) {
        int[] array = new int[lengthArray(numN, numK)];
        int j = 0;
        for (int i = 0; i <= numN; i++) {
            if (sumOfOddNumbers(arrayOfNumbers(i)) == numK) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }
}
