package com.kova;

import com.kova.student.Student;
import com.kova.student.StudentThree;
import com.kova.student.StudentTwo;
import com.kova.util.Course;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.List.*;
import static java.util.stream.Collectors.*;

public class StudentRunner {

    private static final int MIN_AMOUNT_GRADES = 3;

    public static void main(String[] args) {
        List<Student> students = of(
                new Student("Alexandr","Tikhonov", Course.FIRST, of(2, 3, 4, 5, 2, 4)),
                new Student("Sergey","Chistovich", Course.SECOND, of(3, 4)),
                new Student("Andrey","Tatishchev", Course.THIRD, of(5, 4, 3, 3, 4, 5, 2, 4)),
                new Student("Kiril","Obyedalov", Course.FOURTH, of(2, 4)),
                new Student("Antonina","Yazova", Course.FOURTH, of(2, 2, 4, 1, 2, 1)),
                new Student("Anna","Ilyina", Course.THIRD, of(2, 3, 2, 4)),
                new Student("Vasilina","Akopyan", Course.THIRD, of(4, 5, 2, 4)),
                new Student("Antonina","Anichkina", Course.FIRST, of(5)),
                new Student("Galina","Smelyanskaya", Course.SECOND, of(2, 5, 2, 4)),
                new Student("Antonina","Tyurina", Course.SECOND, of(1, 2, 1, 2, 2)),
                new Student("Stanislav","Malyshev", Course.FIRST, of(2, 3, 3, 3, 2, 3)),
                new Student("Semyon","Nuriyev", Course.FOURTH, of(1, 3, 1, 2, 2, 1))
        );

        System.out.println(getAverageGradesOfCourse(students));

        List<StudentTwo> studentTwoList = sortedFirstNameAndLastName(students);

        for (StudentTwo studentTwo : studentTwoList) {
            System.out.println(studentTwo);
        }

        List<StudentThree> studentThreeList = getAverageMarkStudent(students);

        for (StudentThree studentThree : studentThreeList) {
            System.out.println(studentThree);
        }
    }

    private static List<StudentTwo> sortedFirstNameAndLastName(List<Student> students) {
        return students
                .stream()
                .filter(student -> student.getGrades().size() > MIN_AMOUNT_GRADES)
                .map(s -> new StudentTwo(s.getFirstName(),s.getLastName()))
                .sorted(Comparator.comparing(StudentTwo::getFirstNameTwo).thenComparing(StudentTwo::getLastNameTwo))
                .collect(Collectors.toList());
    }

    private static List<StudentThree> getAverageMarkStudent(List<Student> students) {
        return students
                .stream()
                .filter(student -> student.getGrades().size() > MIN_AMOUNT_GRADES)
                .map(s -> new StudentThree(s.getFirstName(),s.getLastName(),
                        s.getGrades().stream().mapToDouble(a -> a).average().orElse(0.0)))
                .sorted(Comparator.comparing(StudentThree::getFirstNameThree)
                        .thenComparing(StudentThree::getLastNameThree))
                .collect(Collectors.toList());
    }

    private static Map<Course, Double> getAverageGradesOfCourse(List<Student> students) {
        return students.stream()
                .filter(student -> student.getGrades().size() > MIN_AMOUNT_GRADES)
                .collect(groupingBy(Student::getCourse,
                        mapping(Student::getGrades, averagingDouble(Student::averageMark))));
    }
}
