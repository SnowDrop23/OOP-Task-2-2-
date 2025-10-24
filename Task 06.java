/*
Task: 
Create a class Employee with method work() printing "Employee working".

Create subclass Manager overriding work() to print "Manager managing" and adding method manageTeam() printing "Managing team".

In Main:
* Assign a Manager object to an Employee reference.
* Call work() on that reference (demonstrating dynamic method dispatch).


for eclipse IDE, for VS Code just REMOVE PUBLIC keyword from both parent class and child class

*/


public class Employee {
	
	void work() {
		System.out.println("Employee Working");
	}

}

public class Manager extends Employee{
	
	void work() {
		System.out.println("Manager managing");
	}
	
	void manageTeam()
	{
		System.out.println("Managing team");
	}

}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Manager();
		e1.work();
		
	}
}
