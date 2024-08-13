
package employeemanagmentsystem2;


public class EmployeeManagmentSystem2 {


  	public static void main(String[] args) 
	{
		Employee employee = new Employee();
		employee.setAge(20);
		employee.setName("Nicat");
		employee.setPosition("Developer");
		employee.setSalary(70000);
		
		System.out.println(employee.getAge() + "\n" + employee.getName() + "\n" + employee.getPosition() + "\n" + employee.getSalary());
		
		

	}
    
}
