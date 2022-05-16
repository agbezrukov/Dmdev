package com.kova.lesson7;

import java.util.Arrays;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы
 * (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 *
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции.
 * main - только для тестирования написанного функционала.
 */
public class HomeWork1 {
    public static void main(String[] args) {
       int [] values = {3, 5, -6, 3, 2, -9, 0, -123};

       int [] valuePositive = deleteNegativeNumbers(values);

        System.out.println(Arrays.toString(valuePositive));

    }

    private static int [] deleteNegativeNumbers(int [] values){

        int [] positiveValues = new int[amountPositiveNumbers(values)];

        int count = 0;

        for (int i = 0; i < values.length; i++) {
                if (values[i] >= 0){
                    values[i] *= amountPositiveNumbers(values);
                    positiveValues[count] = values[i];
                    count++;
            }
        }
        return positiveValues;
    }

    private static int amountPositiveNumbers(int [] values){
        int sumIndex = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] >= 0){
                sumIndex++;
            }
        }
        return sumIndex;
    }
}
