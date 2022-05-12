package com.kova.lesson5;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число,
 * а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */
public class HomeWork1 {
    public static void main(String[] args) {
        int count = 228910;
        System.out.println("В числе " + count + " четных цифр " +  amountEven(count) + " и " +
                "не четных цифр " +  amountOdd(count));
    }

    public static int amountEven(int value) {
        int count = 0;
        for (int i = value; 0 < i; i /= 10) {
            int balance = i % 10;
            if (balance % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int amountOdd(int value) {
        int count = 0;
        for (int i = value; 0 < i; i /= 10) {
            int balance = i % 10;
            if (balance % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
