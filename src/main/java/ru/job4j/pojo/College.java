package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("23тмп1");
        student.setAdmissionDate(LocalDate.now());
        System.out.println(student.getFullName());
        System.out.println(student.getGroup());
        System.out.println(student.getAdmissionDate());
    }
}
