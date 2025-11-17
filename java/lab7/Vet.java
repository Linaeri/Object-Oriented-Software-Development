// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 11-November-2025
// Lab		    	: Lab 7/Exercise 1
// Purpose 	    	: Vet class


package lab7;

public class Vet{
	// Variables
	private String name;

	// Constructor
	public Vet(String name){
		this.name = name; 
	}

	// Getters and Setters
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	// Vaccinate: outputs the vet and the details of the animal being vaccinated
	public void Vaccinate(Animal animal){ 
		System.out.println(name + " is vaccinating.");
		if (animal instanceof Dog){ // instanceof returns true if the object (animal) is of the class (Dog)
			System.out.println("Dog has been vaccinated: " + animal.toString());
		}
		else if (animal instanceof Cat){
			System.out.println("Cat has been vaccinated: " + animal.toString());
		}
		
	}
	// ToString

}