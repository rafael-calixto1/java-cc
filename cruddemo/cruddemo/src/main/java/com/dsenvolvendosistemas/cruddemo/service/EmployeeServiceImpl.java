package com.dsenvolvendosistemas.cruddemo.service;

import com.dsenvolvendosistemas.cruddemo.dao.EmployeeDAO;
import com.dsenvolvendosistemas.cruddemo.dao.EmployeeDAOJpaImpl;
import com.dsenvolvendosistemas.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
