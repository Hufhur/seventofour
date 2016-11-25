package nl.mikee.sevento4.domain;

import java.time.LocalDate;

public class Workday {
	
	private LocalDate aWorkday;
	private String company;
	private String project;
	private String task;
	private String memo;
	private Double hours;
	private Double rate = 100.00;
	

	public Workday(LocalDate aWorkday) {
		this.aWorkday = aWorkday;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getProject() {
		return project;
	}


	public void setProject(String project) {
		this.project = project;
	}


	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}


	public Double getHours() {
		return hours;
	}


	public void setHours(Double hours) {
		this.hours = hours;
	}


	public Double getRate() {
		return rate;
	}


	public void setRate(Double rate) {
		this.rate = rate;
	}
	
	
	
	

}
