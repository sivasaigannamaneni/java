package com.wipro.java.oops.polymorphism;

public class Engineer {
	private String name;
	private String workDomain;
	private int experience;
	public Engineer() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWorkDomain() {
		return workDomain;
	}
	public void setWorkDomain(String workDomain) {
		this.workDomain = workDomain;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public void details() {
		System.out.println("Name : "+name+" Working Domain : "+workDomain+" Experience : "+experience);
	}
}
