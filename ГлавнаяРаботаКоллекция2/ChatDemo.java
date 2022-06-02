package com.kova;

import java.util.*;

import static com.kova.ChatUtil.getAverageAgeUsers;
import static com.kova.ChatUtil.getListUsersAllChats;

public class ChatDemo {
    public static void main(String[] args) {

        User ivan = new User(26, "Ivan", 27);
        User alex = new User(6, "Alex", 17);
        User mihail = new User(23, "Mihail", 66);
        User norman = new User(99, "Norman", 38);
        User andrey = new User(17, "Andrey", 15);
        User bob = new User(55, "Bob", 10);
        User sergey = new User(76, "Sergey", 18);
        User boris = new User(1, "Boris", 17);
        User albert = new User(11, "Albert", 18);
        User egor = new User(144, "Egor", 28);
        User damir = new User(121, "Damir", 35);
        User rodion = new User(44, "Rodion", 14);

        List<User> audiClubChatRoom = new ArrayList<>();
        audiClubChatRoom.add(ivan);
        audiClubChatRoom.add(alex);
        audiClubChatRoom.add(mihail);

        List<User> bmwClubChatRoom = new ArrayList<>();
        bmwClubChatRoom.add(norman);
        bmwClubChatRoom.add(andrey);
        bmwClubChatRoom.add(bob);

        List<User> toyotaClubChatRoom = new ArrayList<>();
        toyotaClubChatRoom.add(sergey);
        toyotaClubChatRoom.add(boris);
        toyotaClubChatRoom.add(albert);

        List<User> hondaClubChatRoom = new ArrayList<>();
        hondaClubChatRoom.add(egor);
        hondaClubChatRoom.add(damir);
        hondaClubChatRoom.add(rodion);

        Chat audiClubChat = new Chat("Чат Ауди клуба", audiClubChatRoom);
        Chat bmwClubChat = new Chat("Чат БМВ клуба", bmwClubChatRoom);
        Chat toyotaClubChat = new Chat("Чат Тойтота клуба", toyotaClubChatRoom);
        Chat hondaClubChat = new Chat("Чат Хонда клуба", hondaClubChatRoom);

        List<Chat> chatList = Arrays.asList(audiClubChat, bmwClubChat, toyotaClubChat, hondaClubChat);

        List<User> userList = getListUsersAllChats(chatList);
        System.out.println(getListUsersAllChats(chatList));

        System.out.println(getAverageAgeUsers(userList));
    }
}

