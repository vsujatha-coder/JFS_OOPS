package com.flm;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Department department1 = new Department();
		Professor professor = new Professor();
		
		
		//department1
		System.out.println("----Enter Department1 details---- \n"
				+ "Department Name : \n"
				+ "Number of Students of Department : ");
		String department1Name = sc.nextLine();
		int department1NumberOfStudents = sc.nextInt();
		sc.nextLine();
	
		
		System.out.println("----Enter Professor details for Department1---- \n"
				+ "Professor name for Department1: \n"
				+ "Professor Subject for Department1 : \n"
				+ "Professor Experience :  ");
		String name_dept1= sc.nextLine();
		String subject_dept1 = sc.nextLine();
		
		int experience_dept1 = sc.nextInt();
		
		professor.setName(name_dept1);
		professor.setSubject(subject_dept1);
		professor.setExperience(experience_dept1);
		
		department1.setDepartmentName(department1Name);
		department1.setNumberOfStudents(department1NumberOfStudents);
		department1.setProfessor(professor);
		
		System.out.println("*****"+department1.getDepartmentName()+"******");
		System.out.println(department1+"\n");
		
		
		//department2
		System.out.println("----Enter Department2 details---- \n"
				+ "Department Name : \n"
				+ "Number of Students of Department : ");
		sc.nextLine();
		String department2Name = sc.nextLine();
		int department2NumberOfStudents = sc.nextInt();
		sc.nextLine();
		
		System.out.println("----Enter Professor details for Department2---- \n"
				+ "Professor name for Department2: \n"
				+ "Professor Subject for Department2 : \n"
				+ "Professor Experience :  ");
		String name_dept2= sc.nextLine();
		String subject_dept2 = sc.nextLine();
		int experience_dept2 = sc.nextInt();
		
		Department department2 = new Department(department2Name,department2NumberOfStudents,(new Professor(name_dept2,subject_dept2,experience_dept2)));
		System.out.println("*****"+department2.getDepartmentName()+"******");
		System.out.println(department2+"\n");
		
		
		//department3
		System.out.println("----Enter Department3 details---- \n"
				+ "Department Name : \n"
				+ "Number of Students of Department : ");
		String department3Name = sc.nextLine();
		sc.nextLine();
		int department3NumberOfStudents = sc.nextInt();
		sc.nextLine();
		
		System.out.println("----Enter Professor details for Department3---- \n"
				+ "Professor name for Department3: \n"
				+ "Professor Subject for Department3 : \n"
				+ "Professor Experience :  ");
		String name_dept3= sc.nextLine();
		String subject_dept3 = sc.nextLine();
		int experience_dept3 = sc.nextInt();
	
		Department department3 = new Department();
		department3.setDepartmentName(name_dept3);
		
		
		System.out.println("*****"+department3.getDepartmentName()+"******");
		System.out.println(new Department(department3Name,department3NumberOfStudents,(new Professor(name_dept3,subject_dept3,experience_dept3)))+"\n");
		
		
		sc.close();
		
		
		
		
	}

}
