package com.kova;

import java.util.Iterator;
import java.util.List;

public final class ChatDelete {

    public ChatDelete() {
    }

    public static void deleteChats(List<Chat> chats) {

        final int LIMIT_NUMBER_USER = 1000;

        Iterator<Chat> chatIterator = chats.iterator();
        while (chatIterator.hasNext()){
            Chat nextChat = chatIterator.next();
            if (nextChat.getNumberUser() < LIMIT_NUMBER_USER) {
                chatIterator.remove();
            }
        }
    }

}
