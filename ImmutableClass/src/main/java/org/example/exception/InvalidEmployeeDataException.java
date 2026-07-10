package org.example.exception;

/*
Custom Exception
Thrown When invalid employee details are provide
 */
public class InvalidEmployeeDataException extends RuntimeException {
    public InvalidEmployeeDataException(String message) {
        super(message);
    }
}
