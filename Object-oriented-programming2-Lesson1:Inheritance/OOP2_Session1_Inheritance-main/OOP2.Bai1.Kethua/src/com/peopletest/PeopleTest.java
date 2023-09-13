package com.peopletest;

public class PeopleTest {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people);
        people = new People("Nguyen Van C", false, 18);
        System.out.println(people);

        people.setAge(20);
        System.out.println(people);
    }
}
