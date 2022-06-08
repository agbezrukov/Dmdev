package com.kova.student;

public class StudentTwo {

    private final String firstNameTwo;
    private final String lastNameTwo;

    public StudentTwo(String firstNameTwo, String lastNameTwo) {
        this.firstNameTwo = firstNameTwo;
        this.lastNameTwo = lastNameTwo;
    }

    public String getFirstNameTwo() {
        return firstNameTwo;
    }

    public String getLastNameTwo() {
        return lastNameTwo;
    }

    @Override
    public String toString() {
        return "StudentTwo{" +
                "firstNameTwo='" + firstNameTwo + '\'' +
                ", lastNameTwo='" + lastNameTwo + '\'' +
                '}';
    }
}
