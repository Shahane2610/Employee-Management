package com.assignment.company.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.company.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findById(long id);

}
