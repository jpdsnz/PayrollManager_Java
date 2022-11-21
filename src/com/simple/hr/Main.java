package com.simple.hr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //Department Objects
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept3 = new Department("Sales");

        //Department List
        List<Department> departments = new ArrayList<>();

        //Address Object
        Address address = new Address("5 Emerald close", "Kingston", "Kingston", "00000");

        //Salaried Employees
        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000, dept1);
        SalariedEmployee emp2 = new SalariedEmployee("Jane White", 57000, dept2);
        SalariedEmployee emp3 = new SalariedEmployee("Joe Brown", 50000, dept3);
        SalariedEmployee emp4 = new SalariedEmployee("Sarah Thomas", 50000, dept3);
        SalariedEmployee emp5 = new SalariedEmployee("Alex Eucker", 40000, dept2);

        //Array for employees
        Employee[] employees = {emp1, emp2, emp3,emp4, emp5};

        //List for printing employee info
        List<Employee> employeeList =  Arrays.asList(employees);

        //Print Stream (Not Grouped by dept)
        //employeeList.stream().forEach(System.out::println); //Use scope resolution operator since dealing with stream

        // Group Employees by dept
        System.out.println("Employees grouped by Department");
        Map<String, List<Employee>> groupByDepartment =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupByDepartment.forEach(
                (department, employeesInDepartment) -> //Lamda function
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("  %s%n", employee)
                    );
                }
        );

        //File name
        String fileName = "Paystubs.txt";


        /*
        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        SalariedEmployee.printStub(fileName, employees);
        */



        //HourlyEmployee emp2 = new HourlyEmployee("Jane White", 35);
        //System.out.println(emp1.calculatePay());
        //System.out.println(emp2.calculatePay());
    }


}