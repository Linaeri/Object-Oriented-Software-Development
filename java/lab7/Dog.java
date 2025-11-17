// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 11-November-2025
// Lab		    	: Lab 7/Exercise 1
// Purpose 	    	: Dog aubclass


package lab7;

public class Dog extends Animal{
	
	// Constructor
	public Dog(String name, String breed, int age, char gender){
		super(name, breed, age, gender);
	}
	// implement Eat() class
	public void Eat()
	{
		System.out.println(super.getName() + " eats dog food");
	}
}

