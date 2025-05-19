package com.example.bhakyaPack.Service;



import com.example.bhakyaPack.DTO.EmployeePayrollDTO;
import com.example.bhakyaPack.Model.EmployeePayrollData;

public interface EmployeePayrollService {
    String getAllEmployees();
    String getEmployeeById(int id);
    EmployeePayrollData createEmployee(EmployeePayrollDTO empDTO);
    String updateEmployee(Object employeeData);
    String deleteEmployee(int id);
}
