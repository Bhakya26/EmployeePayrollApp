package com.example.bhakyaPack.Service;
import org.springframework.stereotype.Service;
import com.example.bhakyaPack.DTO.EmployeePayrollDTO;
import com.example.bhakyaPack.Model.EmployeePayrollData;
import com.example.bhakyaPack.Exception.EmployeeNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollServiceImpl implements EmployeePayrollService {

    private final List<EmployeePayrollData> employeeList = new ArrayList<>();
    

    @Override
    public List<EmployeePayrollData> getAllEmployees() {
        return employeeList;
    }

    @Override
    public EmployeePayrollData getEmployeeById(int id) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("Employee with ID " + id + " not found"));
    }

    @Override
    public EmployeePayrollData createEmployee(EmployeePayrollDTO empDTO) {
        EmployeePayrollData newEmployee = new EmployeePayrollData(empDTO.getName(), empDTO.getSalary());
        employeeList.add(newEmployee);
        return newEmployee;
    }

    @Override
    public EmployeePayrollData updateEmployee(int id, EmployeePayrollDTO empDTO) {
        EmployeePayrollData employee = getEmployeeById(id);
        employee.setName(empDTO.getName());
        employee.setSalary(empDTO.getSalary());
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
    	 EmployeePayrollData employee = getEmployeeById(id);
         employeeList.remove(employee);
}
}
