package com.kova.lesson5;

/**
 * Задание 3
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию
 * на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 *
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 *
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class HomeWork3 {
    public static void main(String[] args) {

        double salary = 600;
        int year = 0;
        int month = 12;

        double sumBroker = brokerAccount(salary,year,month);
        double sumAccount = salaryAccount(salary,year,month);
        System.out.println("За период " + year + " year " + month + " month");
        System.out.printf("на счету брокера накопилось " + "%.2f",sumBroker);
        System.out.println();
        System.out.printf("на моем счету накопилось " + "%.2f",sumAccount);



    }

    public static double salaryAccount(double value, int year, int month){
        double money;
        double sumMoney = 0;
            for (int i = 1; i <= sumMonth(year,month); i++) {
                if (i % 6 == 0 ){
                    money = value - value / 10;
                    money -= wasteOfMoney();
                    sumMoney += money;
                    value += 400;
                    money = 0;
                } else {
                    money = value - value / 10;
                    money -= wasteOfMoney();
                    sumMoney += money;
                    money = 0;
                }
            }
return sumMoney;
    }

    private static double brokerAccount(double value, int year, int month){
        double sum = 0;
        for (int i = 1; i <= sumMonth(year,month); i++) {
            if (i % 6 == 0){
                sum += value / 10;
                value += 400;
                sum += sum / 100 * brokerPercent();
            } else {
                sum += value / 10;
                sum += sum / 100 * brokerPercent();
            }
        }
        return sum;
    }

    private static int sumMonth(int year, int month) {
        if (year >= 0 && month > 0 && month <= 12){
            return year * 12 + month;
        }else {
            return 0;
        }
    }

    private static int wasteOfMoney(){
        return 300;
    }

    private static int brokerPercent(){
        return 2;
    }
    
}
