/*
Liam enjoys meeting new people and greeting them warmly. He wants a small program to help him greet people in different ways.

Liam wants to:
Create a class Greeter with a method greet() that handles all these types.

* Overload the method to:
Greet without any input.
Greet with just a name.
Greet with both name and age.

* Call each version of the method in the main() function to see the greetings.

use eclipse to run

*/

//Main.java
package firstproject;

public class Main {

	public static void main(String[] args) {
		
		Greeter g1 = new Greeter();
		g1.greet();
		g1.greet("Liam");
		g1.greet("Liam", 21);
		
	}

}


//Greeter.java
package firstproject;

public class Greeter {
	
	void greet()
	{
		System.out.println("Hi there");
	}
	
	void greet(String name)
	{
		System.out.println("Hello " + name);
	}
	
	void greet(String name, int age)
	{
		System.out.println(name + age);
	}
}

