package com.peopletest;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee);

        employee = new Employee("Nguyen Thi A", true, 21, "FPT");
        System.out.println(employee);

        employee.work();
        employee.setEnterprise("Viettel");
        System.out.println(employee);
    }
}
