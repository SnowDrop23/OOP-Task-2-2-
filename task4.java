/*
Task: 14.10.2025
1. Create a base class called Pet with the following:

Fields: String pet_name, int age
Method: int displayInfo(), which displays the name and age

Then, create two subclasses:
Dog – has an additional method void bark() that prints "Woof!"
Cat – has an additional method void meow() that prints "Meow!"

Test in main:
Create one Dog and one Cat, call displayInfo() and their own specific methods

*/

Main.java
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pet p = new Pet();
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.displayInfo("Buddy", 4);
		d.bark();
		c.displayInfo("Kitty", 3);
		c.moew();

	}
}

Pet.java
public class Pet {
	String pet_name;
	int age;
	
	int displayInfo(String pet_name, int age) {
		System.out.println("Pet name: " + pet_name + "\nAge: " + age);
		return age;
	}

}


Dog.java
public class Dog extends Pet{
	
	void bark() {
		System.out.println("Woof!");
	}

}


Cat.java
public class Cat extends Pet{
	
	void moew () {
		System.out.println("Meow!");
	}

}


  
