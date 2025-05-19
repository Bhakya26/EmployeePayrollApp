package com.example.bhakyaPack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmployeePayrollApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(EmployeePayrollApp2Application.class, args);
	}

}
