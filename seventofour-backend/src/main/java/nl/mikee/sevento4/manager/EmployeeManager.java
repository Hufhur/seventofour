package nl.mikee.sevento4.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nl.mikee.sevento4.domain.Employee;

public class EmployeeManager {
	
	private List<Employee> employees = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public boolean deleteEmployee(Employee employee) {
		return employees.remove(employee);
	}
	
	public Employee getEmployee(int id) {
		Employee emp = null;
		Iterator iterator = employees.iterator();
		while(iterator.hasNext()){
			emp = (Employee)iterator.next();
			if(emp.getId() == id) {
				break;
			}
		}
		
		return emp;
		
	}
	
	public List<Employee> getEmployees() {
		return employees;
	}
	
	public Employee getFirstEmployeeWithName(String name) {
		Employee emp = null;
		Iterator iterator = employees.iterator();
		while(iterator.hasNext()){
			emp = (Employee)iterator.next();
			if(name.equalsIgnoreCase(emp.getName())) {
				break;
			}
		}
		
		return emp;
		
	}
	
	public int getNumberOfEmployees(){
		return employees.size();
	}
	

}
