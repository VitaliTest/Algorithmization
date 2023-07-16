package com.company.decompositionUsingMethods;

public class Task15 {

    public static void main(String[] args) {
        int num = 3;
        increasingSequence(num, array(num));
    }

    public static int[] arrayNumbers(int num) {
        char[] charArr = Integer.toString(num).toCharArray();
        int[] array = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            array[i] = Character.getNumericValue(charArr[i]);
        }
        return array;
    }

    public static int[] array(int num) {
        int[] array = new int[((int) Math.pow(10, num)) - (int) Math.pow(10, num - 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(10, num - 1) + i;
        }
        return array;
    }

    public static int number(int[] array) {
        StringBuilder string = new StringBuilder();
        for (int j : array) {
            string.append(j);
        }
        return Integer.parseInt(string.toString());
    }

    public static void increasingSequence(int n, int[] array) {
        System.out.println(n + "-значные числа со строго возрастающей последовательностью:");
        for (int k : array) {
            int[] temp = arrayNumbers(k);
            int count = 0;
            for (int j = 0; j < temp.length - 1; j++) {
                if (temp[j + 1] - temp[j] == 1) {
                    count++;
                } else break;
            }
            if (count == temp.length - 1) {
                System.out.println(number(temp));
            }
        }
    }
}
