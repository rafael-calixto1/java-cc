package com.dsenvolvendosistemas.employeemanagement.service;

import com.dsenvolvendosistemas.employeemanagement.dao.EmployeeDAO;
import com.dsenvolvendosistemas.employeemanagement.dao.EmployeeDAOImpl;
import com.dsenvolvendosistemas.employeemanagement.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
