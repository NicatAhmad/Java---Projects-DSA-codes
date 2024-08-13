/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagmentsystem;

/**
 *
 * @author nicat
 */
public class EmployeeManagmentSystem {

   public  static void  main (String []args ) 
	{
		Employee emp1 = new Employee(101,"Nicat", "Developer", 10000.0f);
		String details = emp1.toString();
		System.out.println(details);
		
		emp1.setEmployeeSalary(20000.0f);
        System.out.println("My salary : " + emp1.getEmployeeSalary());
		
	}
    
}
