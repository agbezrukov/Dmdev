package com.kova.lesson7;

import java.util.Arrays;

import static java.lang.Integer.*;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class HomeTask2 {
    public static void main(String[] args) {

        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println("Массив цифр - " + Arrays.toString(returnArrayNumbers(str)));
        System.out.println("Сумма цифр массива: " + returnSumNumbers(returnArrayNumbers(str)));
    }


    private static int [] returnArrayNumbers(String str){

        String result = str.replaceAll("[^0-9]","");

        StringBuilder sb = new StringBuilder(result);

        int [] numbers = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            numbers[i] = parseInt(String.valueOf(sb.charAt(i)));
        }

        return numbers;
    }

    private static int returnSumNumbers(int [] value){

        int sum = 0;

        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }

        return sum;
    }
}
