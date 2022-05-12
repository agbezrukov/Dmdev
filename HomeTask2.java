package com.kova.lesson5;

/**
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */
public class HomeTask2 {
    public static void main(String[] args) {

        double operand1 = 0;
        double operand2 = 2;
        char operation = '.';

        System.out.println(arithmeticOperation(operand1,operand2,operation));
    }

    public static double arithmeticOperation(double operand1, double operand2, char operation){

        if (operation == '+'){
            return operand1 + operand2;
        }else if (operation == '-'){
            return operand1 - operand2;
        }else if (operation == '*'){
            return operand1 * operand2;
        }else if (operation == '/'){
            return operand1 / operand2;
        }else if (operation == '%'){
            return operand1 % operand2;
        }else {
            return 0;
        }
    }
}
