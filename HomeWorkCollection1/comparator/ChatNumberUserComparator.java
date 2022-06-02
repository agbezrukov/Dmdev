package com.kova.comparator;

import com.kova.Chat;

import java.util.Comparator;

public class ChatNumberUserComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {

        return Integer.compare(o1.getNumberUser(), o2.getNumberUser());
    }
}
