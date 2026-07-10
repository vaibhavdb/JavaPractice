package org.example.model;

import java.lang.reflect.Constructor;

public class Employee {

    private final int id;
    private final String name;
    private final String department;

    //Constructor for Obj Initialization
    public Employee(int id, String name, String department) {

        //Validate EmpID
        if (id <= 0) {
            throw new IllegalArgumentException("Employee id must be greater than zero");
        }

        //Validate EmpName
        if (name == null) {
            throw new IllegalArgumentException("Employee name cannot be null");
        }

        //Validate EmpDept
        if (department == null) {
            throw new IllegalArgumentException("Employee department cannot be null");
        }

        this.id = id;
        this.name = name;
        this.department = department;
    }


    //Getter Method Read Only
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    //Disply Emp Details
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }


}
