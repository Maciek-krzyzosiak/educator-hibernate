package com.bihuniak.educator;

import com.bihuniak.educator.Company.Department;
import com.bihuniak.educator.Company.DepartmentRepository;
import com.bihuniak.educator.Company.Employee;
import com.bihuniak.educator.Company.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import static java.util.Arrays.asList;


@SpringBootApplication
public class EducatorApplication {


	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EducatorApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Employee employee1 = new Employee("Januszek", "Designer");
		Employee employee2 = new Employee("Maciuszek", "Head of Designers");
		Employee employee3 = new Employee("Niemaciuszek", "Art Master");

		Department department = new Department(
				"Marketing",
				"Wrocław",
				5,
				asList(employee1, employee2,employee3));

		departmentRepository.save(department);
//		employeeRepository.save(employee);
//		System.out.println(departmentRepository.findById(5L).get());
//		System.out.println(employeeRepository.findById(6L).get());
	}



}
