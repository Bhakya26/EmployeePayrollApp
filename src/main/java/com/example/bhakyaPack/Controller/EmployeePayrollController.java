package com.example.bhakyaPack.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bhakyaPack.DTO.EmployeePayrollDTO;
import com.example.bhakyaPack.Model.EmployeePayrollData;
import com.example.bhakyaPack.Service.EmployeePayrollService;

import jakarta.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController {

  @Autowired
  private EmployeePayrollService payrollService;

  @GetMapping("/")
  public String getAllEmployees() {
      return payrollService.getAllEmployees();
  }

  @GetMapping("/get/{id}")
  public String getEmployee(@PathVariable("id") int id) {
      return payrollService.getEmployeeById(id);
  }

  @PostMapping("/create")
  public EmployeePayrollData createEmployee(@Valid @RequestBody EmployeePayrollDTO empDTO) {
      return payrollService.createEmployee(empDTO);
  }

  @PutMapping("/update")
  public String updateEmployee(@RequestBody Map<String, Object> employeeData) {
      return payrollService.updateEmployee(employeeData);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteEmployee(@PathVariable("id") int id) {
      return payrollService.deleteEmployee(id);
  }
}