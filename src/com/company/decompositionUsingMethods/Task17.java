package com.company.decompositionUsingMethods;

public class Task17 {

    public static void main(String[] args) {
        int num = 11;
        System.out.println("Количество вычитаний из числа " + num + " равно " + subtraction(num));
    }

    public static int[] arrayNumbers(int num) {
        char[] charArr = Integer.toString(Math.abs(num)).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    public static int sumOddNumbers(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    public static int subtraction(int num) {
        int count = 1;
        while (true) {
            int temp = num - sumOddNumbers(arrayNumbers(num));
            if (temp > 0) {
                num = temp;
                count++;
            } else break;
        }
        return count;
    }
}
