package com.springorm;

public class Employee {

	private int employeeId;
	private String employeeName;
	private float employeeSalry;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getEmployeeSalry() {
		return employeeSalry;
	}

	public void setEmployeeSalry(float employeeSalry) {
		this.employeeSalry = employeeSalry;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalry="
				+ employeeSalry + "]";
	}
	

}
