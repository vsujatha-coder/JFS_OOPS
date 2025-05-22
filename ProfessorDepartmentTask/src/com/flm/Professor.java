package com.flm;

public class Professor {
	
	private String name;
	private String subject;
	private int experience;
	
	public Professor() {
		
	}
	public Professor(String name, String subject, int experience) {
		super();
		this.name = name;
		this.subject = subject;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "--Professor Details-- \n"
				+ "  Name=" + name + "\n  Subject=" + subject + "\n  Experience=" + experience;
	}
	
	
	
	

}
