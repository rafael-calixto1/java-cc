package com.dsenvolvendosistemas.employeemanagement.dao;

import com.dsenvolvendosistemas.employeemanagement.entity.Employee;
import java.util.List;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}