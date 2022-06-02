package com.kova.comparator;

import com.kova.Chat;

import java.util.Comparator;

public class ChatNameChatComparator implements Comparator <Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getNameChat().compareTo(o2.getNameChat());
    }
}
