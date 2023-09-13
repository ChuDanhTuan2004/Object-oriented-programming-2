package com.peopletest;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        student = new Student("D101_C2K14");
        System.out.println(student);

        student = new Student("Ta Van A", false, 23, "IBSK1D1");
        System.out.println(student);
    }
}
