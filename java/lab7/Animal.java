// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 11-November-2025
// Lab		    	: Lab 7/Exercise 1
// Purpose 	    	: Animal superclass


package lab7;

public abstract class Animal{
	// Variables
	private static int nextAnimalID = 1001;
	private int animalID;
	private String name;
	private String breed;
	private int age;
	private char gender;

	// Constructor
	public Animal(String name, String breed, int age, char gender){
		animalID = nextAnimalID;
		nextAnimalID++;
		this.name = name;
		this.breed = breed; 
		this.age = age;
		this.gender = gender;
	}

	// Abstract Eat() method - non-abstract subclasses must implement
	public abstract void Eat();

	// Getters and Setters
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getBreed(){
		return breed;
	}

	public void setSpecies(String breed){
		this.breed = breed;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public char getGender(){
		return gender;
	}

	public void setGender(char gender){
		this.gender = gender;
	}

	// ToString
	public String toString(){
		return ("ID: " + animalID + ", name: " + name + ", breed: " + breed + ", age: " + age + ", gender: " + gender);
	}

}