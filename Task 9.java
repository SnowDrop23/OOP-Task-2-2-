/*
Task

2. Create an abstract class Shape with:
Fields: String color
Abstract method double area()
Concrete method void displayColor() that prints the color.

Then create subclasses:
Circle → with a field double radius and implementation of area()
Rectangle → with fields double length, width and implementation of area()

In Main:
Create one Circle and one Rectangle.
Call displayColor() and print their areas.

Eclipse to run
*/

public abstract class Shape {
	String color;
	
	Shape(String color)
	{
		this.color = color;
	}
	
	
	abstract double area();

	void displayColor()
	{
		System.out.println("Color is " + color);
	}
}
public class Circle extends Shape {
	
	double radius;
	Circle(String color, double radius)
	{
		super(color);
		this.radius = radius;
	}
	
	double area ()
	{
		return 3.1416 * radius * radius;
	}
}

public class Ractangle extends Shape {
	double length;
	double width;
	
	Ractangle(String color, double length, double width)
	{
		super(color);
		this.length = length;
		this.width = width;
		
	}
	
	double area () 
	{
		return length * width;
	}
}


package firstproject;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle("Red", 4.0);
		Shape r = new Ractangle("Blue", 5.0, 6.0);
		
		System.out.println("Circle ");
		c.displayColor();
		System.out.println("Area " + c.area());
		
		System.out.println("Rectangle ");
		r.displayColor();
		System.out.println("Area " + r.area());
	}
}
