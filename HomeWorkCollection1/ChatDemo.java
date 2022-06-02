package com.kova;

import com.kova.comparator.ChatNameChatComparator;
import com.kova.comparator.ChatNumberUserComparator;

import java.util.*;

import static com.kova.ChatDelete.deleteChats;


/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 */
public class ChatDemo {
    public static void main(String[] args) {

        List<Chat> chats = new ArrayList<>( Arrays.asList(
                new Chat("Life", 99),
                new Chat("Work", 1300),
                new Chat("DMDEV", 1000),
                new Chat("HardSkill", 698),
                new Chat("Home", 2000),
                new Chat("Metro", 1000),
                new Chat("Taxi", 2000),
                new Chat("AudiClub", 999),
                new Chat("BMWClub", 1000)
        ));

        deleteChats(chats);

        System.out.println(chats);

        chats.sort(new ChatNumberUserComparator());
        System.out.println(chats);

        chats.sort(new ChatNameChatComparator());
        System.out.println(chats);

        chats.sort(new ChatNumberUserComparator().thenComparing(new ChatNameChatComparator()));
        System.out.println(chats);
    }
}
