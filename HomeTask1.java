package com.kova.lesson5;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 *
 * Протестировать функцию в main.
 */
public class HomeTask1 {
    public static void main(String[] args) {
        int minutes = 11;
        quarterHour(minutes);
    }

    public static void quarterHour(int minutes){
        if (minutes >= 0 && minutes <= 14){
            System.out.println("первая четверть часа");
        }else if (minutes >= 15 && minutes <= 29){
            System.out.println("вторая четверть часа");
        }else if (minutes >= 30 && minutes <= 44) {
            System.out.println("третья четверть часа");
        }else if (minutes >= 45 && minutes <= 59) {
            System.out.println("четвертая четверть часа");
        }else {
            System.out.println("не верно указаны минуты");
        }
    }
}
