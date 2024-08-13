/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagmentsystem;

/**
 *
 * @author nicat
 */
public class Employee 
{
	private  int employeeID ;
	private String  employeeName ;
	private String employeeDesignation ;
	private float employeeSalary ;
	
	public Employee ()
	{
		this.employeeID = 0;
		this.employeeDesignation = "";
		this.employeeName = "";
		this.employeeSalary = 0;
	}
	
	public Employee (final int employeeID , final String employeeName , final String employeeDesignation , final float employeeSalary  )
	{
		this.employeeID = employeeID;
		this.employeeDesignation = employeeDesignation;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeDesignation="
				+ employeeDesignation + ", employeeSalary=" + employeeSalary + "]";
	}
	
}
