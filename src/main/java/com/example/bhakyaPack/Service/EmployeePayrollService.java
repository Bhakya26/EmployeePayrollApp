package com.example.bhakyaPack.Service;



import com.example.bhakyaPack.DTO.EmployeePayrollDTO;
import com.example.bhakyaPack.Model.EmployeePayrollData;

import java.util.List;

public interface EmployeePayrollService {
    List<EmployeePayrollData> getAllEmployees();
    EmployeePayrollData getEmployeeById(int id);
    EmployeePayrollData createEmployee(EmployeePayrollDTO empDTO);
    EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO empDTO);
    void deleteEmployee(int id);
}