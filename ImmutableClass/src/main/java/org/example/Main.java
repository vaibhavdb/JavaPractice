package org.example;

import org.example.model.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creating immutable Employee object
        Employee employee = new Employee(1, "Vaibhav", "IT");

        //Shows Employee Details
        System.out.println(employee);

        //Display using getter method
        System.out.println("Employee Id: " + employee.getId());
        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee Depart: " + employee.getDepartment());

       /* Employee Class Does not Contain setter method
               This is not possible
                employee.setName("John");
                employee.setDepartment("Java");
        */
    }
}

