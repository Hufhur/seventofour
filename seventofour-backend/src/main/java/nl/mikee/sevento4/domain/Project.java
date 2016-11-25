package nl.mikee.sevento4.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {
	
	private int id;
	private String name;
	private String manager;
	private List<Employee> employees = new ArrayList<>();;
	private Double budget;
	private List<Task> tasks = new ArrayList<>();;
	
	public Project(String name) {
		this.name = name;
	}
	
	public Project(String name, String manager) {
		
		this.name = name;
		this.manager = manager;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void addTask(Task task) {
		this.tasks.add(task);
	}
	
	
	
	

}
