package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController extends  Exception{

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/addEmployee")
    public void addToCart(@RequestBody EmployeeDTO employeeDTO){
        employeeService.addEmployee(employeeDTO);
    }

    @RequestMapping(value = "/GetEmployees")
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
