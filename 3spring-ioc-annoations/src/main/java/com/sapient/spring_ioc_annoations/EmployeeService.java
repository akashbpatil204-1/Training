package com.sapient.spring_ioc_annoations;
import java.util.*;
public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public List<Employee> fetchAllEmployee();
	public Employee findByOd(long id);
	//public void deleteEmployee
}
