package com.company;

import java.util.*;

public class TwoDimensionalArrays {

    public static void task2_1() {
        int[][] arr = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 2, 12}};
        for (int i = 0; i < arr.length; i = i + 2) {
            if (arr[0][i] > arr[arr.length - 1][i]) {
                System.out.print("Столбец " + (i + 1) + ": ");
                for (int[] ints : arr) {
                    System.out.print(ints[i] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void task2_2() {
        int[][] arr = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.print("Элементы, стоящие на диагонали: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }
    }

    public static void task2_3() {
        int[][] arr = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int k = 2, p = 3;
        System.out.print(k + "-я строка: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[k - 1][i] + " ");
        }
        System.out.print("\n" + p + "-й столбец: ");
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(arr[i][p - 1] + " ");
        }
    }

    public static void task2_4() {
        int n = 10;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = n - j;
                }
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_5() {
        int n = 10;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                arr[i][j] = i + 1;
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_6() {
        int n = 10;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - i; j++) {
                arr[i][j] = 1;
            }
            for (int k = n - 1 - i; k < i + 1; k++) {
                arr[i][k] = 1;
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_7() {
        int n = 10, count = 0;
        double[][] arr = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (arr[i][j] > 0) count++;
            }
        }
        for (double[] doubles : arr) {
            System.out.println(Arrays.toString(doubles));
        }
        System.out.println("Кол-во положительных элементов: " + count);
    }

    public static void task2_8() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первый столбец: ");
        int fstColumn = in.nextInt();
        System.out.print("Введите второй столбец: ");
        int scndColumn = in.nextInt();
        int[][] arr = new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        for (int i = 0; i < arr.length; i++) {
            int buf = arr[i][fstColumn - 1];
            arr[i][fstColumn - 1] = arr[i][scndColumn - 1];
            arr[i][scndColumn - 1] = buf;
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_9() {
        int[][] arr = new int[][]{{1, 2, 4, 3},
                {5, 6, 8, 7},
                {9, 10, 12, 11}};
        int[] sumArr = new int[arr[0].length];
        int maxIndex = 0, max = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int[] ints : arr) {
                sumArr[i] += ints[i];
            }
            if (sumArr[i] > max) {
                maxIndex = i;
                max = sumArr[i];
            }
            System.out.println("Сумма элементов в " + (i + 1) + "-м столбце: " + sumArr[i]);
        }
        System.out.print((maxIndex + 1) + "-й столбец содержит максимальную сумму");
    }

    public static void task2_10() {
        int[][] arr = new int[][]{{-3, 8, 1, -4},
                {-9, 1, 4, 10},
                {8, 10, 2, 5},
                {4, -8, 11, -6}};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] > 0) list.add((arr[i][i]));
        }
        System.out.println("Положительные элементы главной диагонали: " + list);
    }

    public static void task2_11() {
        int[][] arr = new int[10][20];
        ArrayList<Integer> list = new ArrayList<>();
        int[] bufArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (int) (Math.random() * 15);
                if (arr[i][j] == 5) bufArr[i]++;
            }
            if (bufArr[i] >= 3) list.add(i + 1);
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.print("Номера строк, в которых число 5 встречается три и более раз: ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    private static void sortArrayMinToMax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        }
    }

    private static void sortArrayMaxToMin(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int buf = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buf;
                }
            }
        }
    }

    public static void task2_12() {
        int[][] arr = new int[][]{{-3, 8, 1, -4},
                {-9, 1, 4, 10},
                {8, 10, 2, 5}}, newArr = new int[arr.length][arr[0].length];
        System.out.println("Сортировка строк по возрастанию: ");
        for (int i = 0; i < arr.length; i++) {
            int[] bufArr = new int[arr[0].length];
            System.arraycopy(arr[i], 0, bufArr, 0, arr[0].length);
            sortArrayMinToMax(bufArr);
            newArr[i] = bufArr;
        }
        for (int[] ints : newArr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Сортировка строк по убыванию: ");
        for (int i = 0; i < arr.length; i++) {
            int[] bufArr = new int[arr[0].length];
            System.arraycopy(arr[i], 0, bufArr, 0, arr[0].length);
            sortArrayMaxToMin(bufArr);
            newArr[i] = bufArr;
        }
        for (int[] ints : newArr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_13() {
        int[][] arr = new int[][]{{-3, 8, 1, -4},
                {-9, 1, 4, 10},
                {8, 10, 2, 5}}, newArr = new int[arr.length][arr[0].length];
        System.out.println("Сортировка столбцов по возрастанию: ");
        for (int j = 0; j < arr[0].length; j++) {
            int[] bufArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                bufArr[i] = arr[i][j];
            }
            sortArrayMinToMax(bufArr);
            for (int i = 0; i < arr.length; i++) {
                newArr[i][j] = bufArr[i];
            }
        }
        for (int[] ints : newArr) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println("Сортировка столбцов по убыванию: ");
        for (int j = 0; j < arr[0].length; j++) {
            int[] bufArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                bufArr[i] = arr[i][j];
            }
            sortArrayMaxToMin(bufArr);
            for (int i = 0; i < arr.length; i++) {
                newArr[i][j] = bufArr[i];
            }
        }
        for (int[] ints : newArr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_14() {
        int[][] arr = new int[10][9];
        if (arr.length < arr[0].length) {
            System.out.print("Неверно. Столбцов больше, чем строк");
            System.exit(1);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j >= i) arr[i][j] = 1;
                else arr[i][j] = 0;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr[0].length; j++) {
            for (int[] ints : arr) {
                list.add(ints[j]);
            }
            Collections.shuffle(list);
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = list.get(i);
            }
            list.clear();
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_15() {
        int[][] arr = new int[][]{{-3, 8, 1, -4},
                {-9, 1, 4, 10},
                {8, 10, 2, 5}};
        int max = 0;
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                max = Math.max(ints[j], max);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 != 0) arr[i][j] = max;
            }
        }
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void task2_16() {
        int n = 3;
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = 0;
            }
        }
        int i = n / 2;
        int j = n - 1;
        for (int num = 1; num <= n * n; ) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                if (j == n) {
                    j = 0;
                }
                if (i < 0) {
                    i = n - 1;
                }
            }
            if (square[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            } else {
                square[i][j] = num++;
            }
            j++;
            i--;
        }
        for (int ints = 0; ints < n; ints++) {
            for (int jnts = 0; jnts < n; jnts++) {
                System.out.print(square[ints][jnts] + " ");
            }
            System.out.println();
        }
    }
}
