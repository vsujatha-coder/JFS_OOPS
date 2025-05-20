package com.flm;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		
		System.out.println("Enter student 1 ID : ");
		int student1_Id=sc.nextInt();
		student1.setStudent_Id(student1_Id);
		sc.nextLine();
		System.out.println("Enter student 1 name : ");
		String student1_Name=sc.nextLine();
		student1.setStudent_Name(student1_Name);
		System.out.println("Enter student 1 Marks : ");
		int student1_Marks=sc.nextInt();
		student1.setMarks(student1_Marks);
		student1.setGrade(student1_Marks);
		
		Student student2 = new Student();
		
		System.out.println("Enter student 2 ID : ");
		int student2_Id=sc.nextInt();
		student2.setStudent_Id(student2_Id);
		sc.nextLine();
		System.out.println("Enter student 2 name : ");
		String student2_Name=sc.nextLine();
		student2.setStudent_Name(student2_Name);
		System.out.println("Enter student 2 Marks : ");
		int student2_Marks=sc.nextInt();
		student2.setMarks(student2_Marks);
		student2.setGrade(student2_Marks);
		
	
		
		System.out.println("Student1 details : \n"
				+ "------------------------------");
		System.out.println(student1+"\n");
		System.out.println("Student2 details : \n"
				+ "------------------------------");
		System.out.println(student2);
		
		boolean isStudent1EqualsToStudent2 = student1.equals(student2);
		if(isStudent1EqualsToStudent2==true) {
			System.out.println(student1_Name+"details , "+student2_Name+" details are same");
		}
		else {
			System.out.println(student1_Name+" details , "+student2_Name+" details are nt same");
		}
		System.out.println(isStudent1EqualsToStudent2);
		
		System.out.println("hashcode for student1 : "+ student1.hashCode());
		System.out.println("hashcode for student2 : "+student2.hashCode());
		if(student1.hashCode()==student2.hashCode()) {
			System.out.println("hashcodes for "+ student1_Name+" and "+student2_Name+" are same");
		}
		else {
			System.out.println("hashcodes for "+ student1_Name+" and "+student2_Name+" are not same");
		}
	}

}
