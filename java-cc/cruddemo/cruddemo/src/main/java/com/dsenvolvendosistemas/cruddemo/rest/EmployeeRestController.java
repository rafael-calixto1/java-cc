package com.dsenvolvendosistemas.cruddemo.rest;

import com.dsenvolvendosistemas.cruddemo.dao.EmployeeDAO;
import com.dsenvolvendosistemas.cruddemo.entity.Employee;
import com.dsenvolvendosistemas.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    //quick and dirty: inject employee dao using constructor injection
    public EmployeeRestController(EmployeeService theEmployeeService){

        employeeService = theEmployeeService;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        Employee theEmployee = employeeService.findById(employeeId);
        if(theEmployee == null){
            throw new RuntimeException("Employee id not found - "+ employeeId);
        }
        return theEmployee;
    }
}
