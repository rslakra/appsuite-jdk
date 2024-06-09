package com.devamatre.appsuite.jdk8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Rohtash Lakra (work.lakra@gmail.com)
 * @version 1.0.0
 * @since 05/29/2024 5:44 PM
 */
public class StreamDemo {

    private static final class Student {
        Character grade;
        String name;
        int id;

        Student(int id, String name, Character grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        public Character getGrade() {
            return grade;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public static Student of(int id, String name, Character grade) {
            return new Student(id, name, grade);
        }

        @Override
        public String toString() {
            return "Student <" + "grade=" + grade + ", name='" + name + '\'' + ", id=" + id + '>';
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(Student.of(2, "Rohtash", 'a'), Student.of(1, "Singh", 'c'), Student.of(3, "Lakra", 'b'), Student.of(4, "Rohtash", 'b'));
        System.out.println(students);

        // sort using stream
        List<Student> sortedStudents = students.stream().sorted((s1, s2) -> s1.id - s2.id).collect(Collectors.toList());
        System.out.println(sortedStudents);

        List<Student> compStudents = students.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
        System.out.println(compStudents);

        Set<String> distinct = new HashSet<>();
        List<Student> unique = students.stream()
                .filter(s -> distinct.add(s.getName()))
                .collect(Collectors.toList());
        System.out.println(unique);

    }
}
