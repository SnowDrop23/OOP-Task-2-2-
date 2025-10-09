/*
1. Leo runs a garage where he keeps information about cars. Each car has:
a model_name, a speed in km/h, and the year it was made.

Leo wants to:
->Add new cars with their model name, speed, and year.
->Show the car’s details.

Use eclipse to run the code
*/


//Main.java
package firstproject;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		car c1 = new car("Toyota", 250, 2020);
		car c2 = new car("Lamborghini", 230, 2018);
		car c3 = new car("Mercedes", 196, 2024);
		
		c1.show_details();
		c2.show_details();
		c3.show_details();
		
	
		
	}

}


//car.java
package firstproject;

public class car {
	String model_name;
	int speed, year;

	//Parameterized-Constructor
	car (String model_name, int speed, int year)
	{
		this.model_name = model_name;
		this.speed = speed;
		this.year = year;
	}
	
	void show_details()
	{
		System.out.println("Model: " + model_name);
		System.out.println("Speed: " + speed + "km/h");
		System.out.println("Year: " + year);
		System.out.println("---------------------------");
	}

}


