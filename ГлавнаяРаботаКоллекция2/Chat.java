package com.kova;

import java.util.List;

public class Chat {

    private String nameChat;
    private List<User> user;

    public Chat(String nameChat, List<User> user) {
        this.nameChat = nameChat;
        this.user = user;
    }



    public String getNameChat() {
        return nameChat;
    }

    public List<User> getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "nameChat='" + nameChat + '\'' +
                ", user=" + user +
                '}';
    }
}
