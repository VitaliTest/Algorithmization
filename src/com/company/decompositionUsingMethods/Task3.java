package com.company.decompositionUsingMethods;

public class Task3 {

    public static void main(String[] args) {
        int side = 5;
        System.out.print("Площадь правильного шестиугольника равна - ");
        System.out.printf("%.3f", 6 * areaOfTheTriangle(side));
    }

    public static double areaOfTheTriangle(int side) {
        return side * Math.sqrt(3) / 4;
    }
}
