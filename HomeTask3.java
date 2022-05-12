package com.kova.lesson5;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 *
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и
 * выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class HomeTask3 {
    public static void main(String[] args) {

    double a1 = 5;
    double b1 = 1;

    double a2 = 5;
    double b2 = 6;

    compareTriangle(areaTriangle(a1,b1),areaTriangle(a2,b2));
    }

    public static double areaTriangle (double value1, double value2){
        return (value1 * value2) / 2;
    }

    public static void compareTriangle (double value1, double value2){
        if (value1 > value2){
            System.out.println("первый треугольник больше второго");
        }else if (value1 < value2){
            System.out.println("первый треугольник меньше второго");
        }else {
            System.out.println("первый треугольник равен второму");
        }
    }
}
