package com.kova.lesson7;

import java.util.Arrays;

/**
 * Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число
 * - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 *
 * Далее определить среднее арифметическое всех элементов целочисленного массива
 * и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class HomeWork2 {
    public static void main(String[] args) {
    char [] values = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};

    int [] numbers = conversionToInteger(values);

        System.out.println(Arrays.toString(numbers));

        moreAverageNumbers(numbers);

    }

    private static void moreAverageNumbers (int [] values){

        for (int i = 0; i < values.length; i++) {
            if (values[i] > averageNumbers(values)){
                System.out.print(values[i] + " ");
            }
        }
    }

    private static int [] conversionToInteger(char [] values){

        int [] value = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            value[i] = (int)values[i];
        }
        return value;
    }

    private static int averageNumbers(int [] values){
        int sumNumbers = 0;

        for (int i = 0; i < values.length; i++) {
            sumNumbers += values[i];
        }
        return sumNumbers /= values.length;
    }
}
