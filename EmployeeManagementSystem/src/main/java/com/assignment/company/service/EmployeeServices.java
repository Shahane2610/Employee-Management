package com.assignment.company.service;

import com.assignment.company.model.Employee;
import com.assignment.company.model.ResponseDto;

public interface EmployeeServices {
    ResponseDto addEmployee(Employee employee);

    Object getall();

    Object getEmployeeById(long id);

    ResponseDto updateEmployee(long id, Employee employee);

    ResponseDto removeEmployee(long id);
}
