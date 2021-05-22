package com.example.tranthian.service;

import com.example.tranthian.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
    EmployeeEntity createEmployee(EmployeeEntity e);
}
