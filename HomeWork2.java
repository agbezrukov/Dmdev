package com.kova.lesson5;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 *
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class HomeWork2 {
    public static void main(String[] args) {

        int a = 1234567;

        System.out.println(invertedNumber(a));
    }

    public static int invertedNumber(int value){
        int sum = 0;
        for (int i = value; i > 0 ; i /= 10) {
         sum *= 10;
         sum += i % 10;
        }
        return sum;
    }

}
