package com.company.decompositionUsingMethods;

public class Task16 {

    public static void main(String[] args) {
        int num = -11;
        if (oddNumber(arrayNumbers(num))) {
            System.out.print("Число " + num + " состоит из нечетных чисел, сумма цифр равна ");
            int sum = sumOddNumbers(arrayNumbers(num));
            System.out.println(sum);
            System.out.println("Количество четных чисел в сумме цифр числа " + num + " равна " + numberEvenNumbers(arrayNumbers(sum)));
        } else {
            System.out.println("Число " + num + " содержит четные числа или ноль");
        }
    }

    public static int[] arrayNumbers(int num) {
        char[] charArr = Integer.toString(Math.abs(num)).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    public static boolean oddNumber(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                count++;
            } else break;
        }
        return count == array.length;
    }

    public static int sumOddNumbers(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sum;
    }

    public static int numberEvenNumbers(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
