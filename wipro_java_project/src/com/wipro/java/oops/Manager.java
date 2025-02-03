/**
 * 
 */
package com.wipro.java.oops;


/**
 * 
 */
public class Manager extends Employee{

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		Employee employee=new Manager();
		employee.setEmpId(99991);
		employee.setEmpName("XYZ");
		employee.setEmpMailId("xyz@gmail.com");
		employee.setEmpSalary(20000f);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpMailId());
		System.out.println(employee.getEmpSalary());
	}

}