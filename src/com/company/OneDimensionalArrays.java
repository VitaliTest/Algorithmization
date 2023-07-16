package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class OneDimensionalArrays {
    public static void task1_1() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 3, sum = 0;
        for (int n : a) {
            if (n % k == 0) {
                sum += n;
            }
        }
        System.out.print("Сумма элементов, кратных числу " + k + ": " + sum);
    }

    public static void task1_2() {
        int[] a = new int[]{-5, 3, 9, 1, -1, 4, -3, 0};
        int z = 3, count = 0;
        for (int n = 0; n < a.length; n++) {
            if (a[n] > z) {
                a[n] = z;
                count++;
            }
        }
        System.out.print("Замена: " + Arrays.toString(a));
        System.out.println("\nКоличество замен: " + count);
    }

    public static void task1_3() {
        int[] a = new int[]{-5, 3, 9, 1, -1, 4, -3, 0};
        int negCount = 0, posCount = 0, zeroCount = 0;
        for (int n : a) {
            if (n < 0) negCount++;
            else if (n > 0) posCount++;
            else zeroCount++;
        }
        System.out.print("Отрицательных элементов: " + negCount +
                "\nПоложительных элементов: " + posCount +
                "\nНулевых элементов: " + zeroCount);
    }

    public static void task1_4() {
        int[] a = new int[]{-5, 3, 9, 1, 7, 4, -2, 0};
        int minIndex = 0, maxIndex = 0, min = 0, max = 0;
        for (int n = 0; n < a.length; n++) {
            if (a[n] < min) {
                minIndex = n;
                min = a[n];
            }
            if (a[n] > max) {
                maxIndex = n;
                max = a[n];
            }
        }
        int buf = a[maxIndex];
        a[maxIndex] = a[minIndex];
        a[minIndex] = buf;
        System.out.print("Меняем местами максимальный и минимальный элемент: " + Arrays.toString(a));
    }

    public static void task1_5() {
        int[] a = new int[]{-5, 3, 9, 1, 7, 4, -2, 0};
        System.out.print("Ответ: ");
        for (int i = 1; i <= a.length; i++) {
            if (a[i - 1] > i) {
                System.out.print(a[i - 1] + " ");
            }
        }
    }

    public static void task1_6() {
        int[] a = new int[]{-5, 3, 9, 1, 7, 4, -2, 0};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (isSimpleNumber(i)) {
                sum += a[i];
            }
        }
        System.out.print("Ответ: " + sum);
    }

    private static boolean isSimpleNumber(int a) {
        if (a > 1) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void task1_7() {
        int[] a = new int[]{-5, 3, 9, 1, 7, 4, -2, 0};
        if (a.length % 2 != 0) {
            System.out.print("Массив нечетный");
            System.exit(1);
        }
        int[] newA = new int[a.length / 2];
        for (int n = 1; n <= newA.length; n++) {
            newA[n - 1] = a[n - 1] + a[2 * newA.length - n];
        }
        System.out.print("Полученный массив: " + Arrays.toString(newA));
        System.out.print("\nМаксимальный элемент: " + Arrays.stream(newA).max().getAsInt());
    }

    public static void task1_8() {
        int[] a = new int[]{-5, 3, 9, 1, -5, 4, -2, 0};
        int min = Arrays.stream(a).min().getAsInt();
        ArrayList<Integer> newA = new ArrayList<>();
        for (int i : a) {
            newA.add(i);
        }
        newA.removeIf(Predicate.isEqual(min));
        System.out.print("Новый массив без " + min + ": " + newA);
    }

    public static void task1_9() {
        int[] a = new int[]{-6, -6, 9, -5, -5, 1, 4, 4};
        ArrayList<Integer> arrCount = new ArrayList<>(Collections.nCopies(a.length, 0));
        int count, maxCount = 0;
        for (int i = 0; i < a.length; i++) {
            count = 0;
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                    arrCount.set(i, count);
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        int countMaxNumber = 0;
        for (int i : arrCount) {
            if (i == maxCount) {
                countMaxNumber++;
            }
        }
        ArrayList<Integer> buf = new ArrayList<>(Collections.nCopies(countMaxNumber, 0));
        int index = 0;
        for (int i = 0; i < arrCount.size(); i++) {
            if (arrCount.get(i) == maxCount) {
                buf.set(index, a[i]);
                index++;
            }
        }
        int minIndex = 0;
        int min = 0;
        for (int i = 0; i < buf.size(); i++) {
            if (buf.get(i) <= min) {
                min = buf.get(i);
                minIndex = i;
            }
        }
        System.out.println("Наиболее встречающие числа: " + buf);
        System.out.print("Наименьшее из них: " + buf.get(minIndex));
    }

    public static void task1_10() {
        int[] a = new int[]{-6, -6, 9, -5, -5, 1, 4, 4};
        for (int i = 1; i < a.length; i = i + 2) {
            a[i] = 0;
        }
        for (int n : a) {
            System.out.print(n + " ");
        }
    }
}
