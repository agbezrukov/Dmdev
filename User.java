package com.kova;

import java.util.List;

/**
 * id (целочисленный идентификатор), имя и возраст.
 */
public class User {
    private int idUser;
    private String nameUser;
    private int ageUser;

    public User(int idUser, String nameUser, int ageUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.ageUser = ageUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public int getAgeUser() {
        return ageUser;
    }

    @Override
    public String toString() {
        return "User{" +
                "idUser=" + idUser +
                ", nameUser='" + nameUser + '\'' +
                ", ageUser=" + ageUser +
                '}';
    }
}
