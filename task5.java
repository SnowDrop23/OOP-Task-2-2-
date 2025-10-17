/*
Task: 14.10.2025
2. Create a superclass Person with:

Fields: String person_name, int id
Method: int showInfo(), which prints name and id

Create two subclasses:
Student – has an additional method void study() that prints "Studying!"
Teacher – has an additional method void teach() that prints "Teaching!"

Test in main:
Create one Student and one Teacher, call showInfo() and their own specific methods.

use Eclipse to run

*/

Main.java
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.showInfo(" ", 22);
		
		Teacher t = new Teacher();
		t.showInfo(" ", 25);
		
		

	}
}

Person.java
  public class Person {
	String name;
	int age;
	
	int showInfo(String name, int age) {
		System.out.println("Name: " + name + " age: " + age);
		return age;
	}

}

Student.java

public class Student extends Person{
	void study() {
		System.out.println("Stuyding");
	}
	

}
Teacher.java
public class Teacher extends Person {
	
	void teach () {
	System.out.println("Teaching");
	}

}
