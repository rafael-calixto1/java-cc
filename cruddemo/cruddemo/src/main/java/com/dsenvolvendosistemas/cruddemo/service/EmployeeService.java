package com.dsenvolvendosistemas.cruddemo.service;

import com.dsenvolvendosistemas.cruddemo.dao.EmployeeDAO;
import com.dsenvolvendosistemas.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

}

