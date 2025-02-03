/**
 * 
 */
package com.wipro.java.oops.inheritance;


/**
 * 
 */
public class ProjectLead extends Employee{

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee employee=new ProjectLead();
		employee.setEmpId(99993);
		employee.setEmpName("ProjectLead");
		employee.setEmpMailId("projectlead.com");
		employee.setEmpSalary(30000f);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpMailId());
		System.out.println(employee.getEmpSalary());
	}
}