package org.bmj.hr.vo;

import java.sql.Date;

public class Employee {

	private int employeeId, salary, managerId, deapartmentId;
	private double commissionPct;
	private String firstName, lastName, email, phoneNumber, jobId;
	private Date hireDate;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return employeeId+") "+firstName+" "+lastName;
	}
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDeapartmentId() {
		return deapartmentId;
	}

	public void setDeapartmentId(int deapartmentId) {
		this.deapartmentId = deapartmentId;
	}

	public double getCommissionPCT() {
		return commissionPct;
	}

	public void setCommissionPCT(double commissionPCT) {
		this.commissionPct = commissionPCT;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return email;
	}

	public void seteMail(String eMail) {
		this.email = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
