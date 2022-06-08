package com.kova.student;

public class StudentThree {

    private final String firstNameThree;
    private final String lastNameThree;
    private final double gradesThree;

    public StudentThree(String firstNameThree, String lastNameThree, double gradesThree) {
        this.firstNameThree = firstNameThree;
        this.lastNameThree = lastNameThree;
        this.gradesThree = gradesThree;
    }

    public String getFirstNameThree() {
        return firstNameThree;
    }

    public String getLastNameThree() {
        return lastNameThree;
    }

    public double getGradesThree() {
        return gradesThree;
    }

    @Override
    public String toString() {
        return "StudentThree{" +
                "firstNameThree='" + firstNameThree + '\'' +
                ", lastNameThree='" + lastNameThree + '\'' +
                ", gradesThree=" + gradesThree +
                '}';
    }
}
