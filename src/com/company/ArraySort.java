package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {

    public static void task3_1() {
        int k = 3, length1 = 7, length2 = 5;
        if (k > length1) {
            System.out.print("Неверные данные");
            System.exit(1);
        }
        ArrayList<Integer> list1 = new ArrayList<>(length1 + length2), list2 = new ArrayList<>();
        System.out.print("Элементы первого массива: ");
        for (int i = 0; i < length1; i++) {
            list1.add(i, i + 1);
        }
        System.out.println(list1);
        System.out.print("Элементы второго массива: ");
        for (int i = 0; i < length2; i++) {
            list2.add(i + length1 + 1);
        }
        System.out.println(list2);
        System.out.print("Объединение второго массива между " + k + "-м и " + (k + 1) + "-м элементами первого: ");
        for (int i = k, j = 0; i < length2 + k; i++, j++) {
            list1.add(i, list2.get(j));
        }
        System.out.print(list1);
    }

    public static void task3_2() {
        int length1 = 7, length2 = 5;
        ArrayList<Integer> list1 = new ArrayList<>(length1), list2 = new ArrayList<>(length2);
        System.out.print("Элементы первого массива: ");
        for (int i = 0; i < length1; i++) {
            list1.add(i, (int) (Math.random() * 15));
        }
        Collections.sort(list1);
        System.out.println(list1);
        System.out.print("Элементы первого массива: ");
        for (int i = 0; i < length2; i++) {
            list2.add(i, (int) (Math.random() * 15));
        }
        Collections.sort(list2);
        System.out.println(list2);
        System.out.print("Новая неубывающая последовательность из двух массивов: ");
        for (int i = 0; i < length2; i++) {
            list1.add(list2.get(i));
        }
        Collections.sort(list1);
        System.out.print(list1);
    }

    public static void task3_3() {
        int[] arr = new int[]{5, 2, 8, 0, 1, 4, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            int max = 0, index = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int ints : arr) {
            System.out.print(ints + " ");
        }
    }

    public static void task3_4() {
        int[] arr = new int[]{5, 2, 8, 0, 1, 4, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int ints : arr) {
            System.out.print(ints + " ");
        }
    }

    public static int binarySearch(int[] arr, int value) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin <= end) {
            int middle = begin + (end - begin) / 2;
            if (arr[middle] < value) {
                begin = middle + 1;
            } else if (arr[middle] > value) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static void task3_5() {
        int[] arr = new int[]{5, 2, 8, 0, 1, 4, 8};
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = binarySearch(arr, key);
            if (i - j >= 0) System.arraycopy(arr, j, arr, j + 1, i - j);
            arr[j] = key;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

