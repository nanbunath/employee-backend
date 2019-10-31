package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDAO employeeDAO;

    public void addEmployee(EmployeeDTO employeeDTO) {
        employeeDAO.addEmployee(employeeDTO);
    }

    public List<EmployeeDTO> getAllEmployees() {
       return employeeDAO.getAllEmployees();
    }
}

