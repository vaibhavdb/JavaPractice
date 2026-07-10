package org.example.service;


import org.example.model.Employee;

public interface EmployeeService {

    Employee createEmployee(int id, String name, String department);

}
