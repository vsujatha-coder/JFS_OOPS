package com.flm;

import java.util.Objects;

public class Student {
	private int student_Id;
	private String student_Name;
	private String grade;
	private int marks;
	
	
	
	public int getStudent_Id() {
		return student_Id;
	}
	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(int marks) {
		if(marks>=90 && marks<=100) {
			this.grade="A";
			}
		else if(marks>=70 && marks<90) {
			this.grade="B";
		}
		else if(marks>=50 && marks<70) {
			this.grade="C";
		}
		else if(marks==0 && marks<50) {
			this.grade="Fail";
		}
		else if(marks<0 && marks>100) {
			this.grade="Invalid Marks";
		}
	}
	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", grade=" + grade + ", marks="
				+ marks + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(grade, marks, student_Id, student_Name);
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		return Objects.equals(grade, other.grade) && marks == other.marks && student_Id == other.student_Id
				&& Objects.equals(student_Name, other.student_Name);
	}
	
	
	
	
}
