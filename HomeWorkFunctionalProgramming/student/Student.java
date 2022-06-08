package com.kova.student;

import com.kova.util.Course;

import java.util.List;

/**
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 */
public class Student {

    private final String firstName;
    private final String lastName;
    private final Course course;
    private final List<Integer> grades;


    public Student(String firstName, String lastName, Course course, List<Integer> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Course getCourse() {
        return course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    public static double averageMark(List<Integer> list){

         return list.stream()
                .mapToDouble(a -> a)
                .average()
                 .orElse(0.0);
    }
}
