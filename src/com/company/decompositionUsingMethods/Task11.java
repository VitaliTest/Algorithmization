package com.company.decompositionUsingMethods;

public class Task11 {

    public static void main(String[] args) {
        int num1 = 1082;
        int num2 = -108;
        numberOfDigits(num1, num2);
    }

    public static void numberOfDigits(int num1, int num2) {
        char[] charArr1 = Integer.toString(Math.abs(num1)).toCharArray();
        char[] charArr2 = Integer.toString(Math.abs(num2)).toCharArray();
        if (charArr1.length > charArr2.length) {
            System.out.println("Количество цифр в числе " + num1 + " больше, чем в числе " + num2);
        } else if (charArr1.length == charArr2.length) {
            System.out.println("Количество цифр в числе " + num1 + " равно количеству цифр в числе " + num2);
        } else {
            System.out.println("Количество цифр в числе " + num2 + " больше, чем в числе " + num1);
        }
    }
}
