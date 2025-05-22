package com.flm;

public class Department {
	
	private String departmentName;
	private int numberOfStudents;
	public Professor professor;
	
	public Department() {
		
	}
	public Department(String departmentName, int numberOfStudents, Professor professor) {
		super();
		this.departmentName = departmentName;
		this.numberOfStudents = numberOfStudents;
		this.professor = professor;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	@Override
	public String toString() {
		return "-----Department -----\n"
				+ "  departmentName=" + departmentName + "\n"+
				"  numberOfStudents=" + numberOfStudents+ "\n"
				+ professor ;
	}
	
	
	
	

}
