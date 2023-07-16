package com.company.decompositionUsingMethods;

public class Task9 {

    public static void main(String[] args) {
        int sideA = 6;
        int sideB = 10;
        int sideC = 11;
        int sideD = 12;
        boolean isTriangleExists = inspectionTriangle(sideA, sideB, sideC, sideD);
        if (isTriangleExists) {
            System.out.printf("Площадь четырехугольника равна %.2f", squareQuadrilateral(sideA, sideB, sideC, sideD));
        } else {
            System.out.println("Четырехугольника с такими сторонами не существует");
        }
    }

    public static double hypotenuse(int sideA, int sideB) {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public static double squareQuadrilateral(int sideA, int sideB, int sideC, int sideD) {
        double area1 = (double) (sideA * sideB) / 2;
        double sideE = hypotenuse(sideA, sideB);
        double halfPerimetr = (sideC + sideD + sideE) / 2;
        double area2 = Math.sqrt(halfPerimetr * (halfPerimetr - sideC) * (halfPerimetr - sideD) * (halfPerimetr - sideE));
        return area1 + area2;
    }

    public static boolean inspectionTriangle(int sideA, int sideB, int sideC, int sideD) {
        double sideE = hypotenuse(sideA, sideB);
        if (sideC > 0 && sideD > 0 && sideE > 0) {
            return sideC + sideD > sideE && sideC + sideE > sideD && sideD + sideE > sideC;
        } else {
            return false;
        }
    }
}
