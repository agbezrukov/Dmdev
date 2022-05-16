package com.kova.lesson7;

import java.util.Arrays;
import java.util.Locale;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 *
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class HomeTask1 {
    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = deleteCharacter(value);
        System.out.println(result);
    }

    private static String deleteCharacter(String str){

        StringBuilder sb = new StringBuilder(replace(str).toUpperCase(Locale.ROOT));
        for (int i = 1; i < sb.length(); i++) {
            String ch = String.valueOf(sb.charAt(i - 1));
            while (sb.indexOf(ch, i) != -1) {
                sb.deleteCharAt(sb.indexOf(ch, i));
            }
        }
        return sb.toString();
    }

    private static String replace(String value){
        return value.replace(" ","");
    }

}
