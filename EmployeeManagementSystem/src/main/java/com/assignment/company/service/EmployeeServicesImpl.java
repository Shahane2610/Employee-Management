package com.assignment.company.service;

import com.assignment.company.model.Employee;
import com.assignment.company.model.ResponseDto;
import com.assignment.company.repositry.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public ResponseDto addEmployee(Employee employee) {
        ResponseDto responseDto = new ResponseDto();
        try {
            employeeRepository.save(employee);
            responseDto.setStatus("Record inserted successfully !");
            return responseDto;
        }
        catch (Exception e){
            e.printStackTrace();
            responseDto.setStatus("Not inserted");

            return responseDto;
        }
    }

    @Override
    public Object getall() {
        List<Employee> list = employeeRepository.findAll();
        ResponseDto responseDto = new ResponseDto();
        if(list.isEmpty()){
            responseDto.setStatus("Empty Records . Please insert some !");
            return responseDto;

        }


        return list;
    }

    @Override
    public Object getEmployeeById(long id) {
        Employee employee = employeeRepository.findById(id);
        ResponseDto responseDto = new ResponseDto();
        if(employee==null){
            responseDto.setStatus("No record found with this id : "+id);
            return responseDto;
        }
        return employee;
    }

    @Override
    public ResponseDto updateEmployee(long id, Employee employee) {
        Employee existingRecord = employeeRepository.findById(id);
        ResponseDto responseDto = new ResponseDto();
        try{
            existingRecord.setName(employee.getName());
            existingRecord.setCode(employee.getCode());
            existingRecord.setRole(employee.getRole());
            responseDto.setStatus("Updated SuccessFully !");
        }
        catch (Exception e){
            responseDto.setStatus("Not updated successfully");
        }
        employeeRepository.save(existingRecord);
        return responseDto;
    }

    @Override
    public ResponseDto removeEmployee(long id) {
        ResponseDto responseDto = new ResponseDto();
        try{
            employeeRepository.deleteById(id);
            responseDto.setStatus("Removed Successfully");
        }
        catch (Exception e){
            responseDto.setStatus("Not removed");
        }
        return responseDto;
    }
}
