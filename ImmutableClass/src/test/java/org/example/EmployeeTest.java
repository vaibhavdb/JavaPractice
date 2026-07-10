package org.example;

import org.example.model.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Junit Test Cases For Immutable Employee Class

public class EmployeeTest {

    //Verify Object creation
    @Test
    void testEmployeeCreation() {
        Employee employee = new Employee(1, "Vaibhav", "IT");
        assertEquals(1, employee.getId());
        assertEquals("Vaibhav", employee.getName());
        assertEquals("IT", employee.getDepartment());
    }

    //Verify obj is Created
    @Test
    void testEmployeeNotNull() {
        Employee employee = new Employee(2, "Rahul", "HR");
        assertNotNull(employee);
    }

    //Verify ToString Method
    @Test
    void testToString() {
        Employee employee = new Employee(3, "Amit", "Finance");
        assertTrue(employee.toString().contains("Amit"));
    }
}