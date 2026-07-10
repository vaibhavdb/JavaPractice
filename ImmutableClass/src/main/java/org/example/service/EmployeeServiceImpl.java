package org.example.service;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository repository;


    public void setRepository(EmployeeRepository repository) {
        this.repository = repository;
    }


    public EmployeeServiceImpl(EmployeeRepository repository) {

        this.repository = repository;

    }

    public Employee createEmployee(int id, String name, String department) {
        Employee employee = new Employee(id, name, department);
        return repository.save(employee);
    }

}
