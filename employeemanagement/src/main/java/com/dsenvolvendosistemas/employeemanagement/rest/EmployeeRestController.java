package com.dsenvolvendosistemas.employeemanagement.rest;

import com.dsenvolvendosistemas.employeemanagement.dao.EmployeeDAO;

import com.dsenvolvendosistemas.employeemanagement.entity.Employee;
import com.dsenvolvendosistemas.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeRestController {
    EmployeeService employeeService;
    //quick and dirty: inject employee dao (use constructor injection)
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    //expose /employees and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
