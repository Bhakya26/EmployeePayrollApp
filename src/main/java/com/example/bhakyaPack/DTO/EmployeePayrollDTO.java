package com.example.bhakyaPack.DTO;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayrollDTO {

    @NotNull(message = "Employee name cannot be null")
    private String name;

    @Min(value = 500, message = "Salary should be more than 500")
    private long salary;

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public long getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}