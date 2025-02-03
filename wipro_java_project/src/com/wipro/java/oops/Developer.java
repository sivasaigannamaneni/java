/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee employee=new Developer();
		employee.setEmpId(99992);
		employee.setEmpName("Developer");
		employee.setEmpMailId("developer@gmail.com");
		employee.setEmpSalary(40000f);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpMailId());
		System.out.println(employee.getEmpSalary());
	}

}
