package com.springorm.Explane.get;

public class Student {

	private int studentId;
	private String studentName;
	private String studentSalry;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSalry() {
		return studentSalry;
	}

	public void setStudentSalry(String studentSalry) {
		this.studentSalry = studentSalry;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentSalry=" + studentSalry
				+ "]";
	}

}
