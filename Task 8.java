/*
Task: 
1. Create an abstract class Appliance with:
Fields: String brand, boolean isOn
Abstract method void operate()
Concrete method void powerSwitch() that toggles isOn and prints the state.

Then create subclasses:
WashingMachine → implements operate() by printing "Washing clothes..."
Refrigerator → implements operate() by printing "Cooling food..."

Eclipe to run

*/

public abstract class Appliance {
	
	String brand;
	boolean isOn;
	
	Appliance (String brand)
	{
		this.brand = brand;
		this.isOn = false;
	}
	
	abstract void operate ();
	
	void powerswitch() 
	{
		isOn = !isOn;
		if(isOn)
		{
			System.out.println(brand + " is now ON");
		}
		else 
		{
			System.out.println(brand + " is now OFF");
		}
	}

  public class WashingMachine extends Appliance{
	
	WashingMachine (String brand)
	{
		super(brand);
	}
	
	void operate ()
	{
		if(isOn)
		{
			System.out.println(brand + " Washing machine washing clothes");
		}
		else 
		{
			System.out.println("washing maching is OFF. Please turn it ON first");
		}
	}
	

}

public class Refrigerator extends Appliance{
	Refrigerator(String brand)
	{
		super(brand);
	}
	
	void operate ()
	{
		if(isOn)
		{
			System.out.println(brand + " Refrigerator cooling food");
		}
		else 
		{
			System.out.println(brand + " Refrigerator is OFF");
		}
	}

}


package firstproject;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Appliance wm = new WashingMachine("LG");
		Appliance rf = new Refrigerator("Samsung");
		
		wm.operate();
		wm.powerswitch();
		
		
		System.out.println();
		
		rf.operate();
		rf.powerswitch();
		rf.operate();
	}

}

}
