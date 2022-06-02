package com.kova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ChatUtil {

    private ChatUtil() {
    }

    /**
     * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
     */
    public static List<User> getListUsersAllChats(List<Chat> chatList) {
        Map<Integer, User> autoClubChatRoom = new HashMap<>();
        for (Chat chats: chatList) {
            for (User users: chats.getUser()) {
                if (users.getAgeUser() > 17){
                    autoClubChatRoom.put(users.getIdUser(), users );
                }
            }
        }
        List<User> userList = new ArrayList<>(autoClubChatRoom.values());
        return userList;
    }

    /**
     * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
     * @param userList
     * @return
     */

    public static int getAverageAgeUsers(List<User> userList) {
        int sumAge = 0;

        for (User users: userList) {
            sumAge += users.getAgeUser();
        }
        return sumAge/userList.size();
    }
}
