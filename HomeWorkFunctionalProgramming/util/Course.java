package com.kova.util;

public enum Course {
    FIRST(1),
    SECOND(2),
    THIRD(3),
    FOURTH(4);

    private final int course;

    Course(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }
}

