// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 21-October-2025
// Lab		    	: Lab 6/Exercise 1
// Purpose 	    	: Defines a Person superclass


package lab6;

public class Person {
	   // Variables
	   private String name;
	   private String address;
	   
	   // Constructors
	   public Person(String name, String address) {
	      this.name = name;
	      this.address = address;
	   }
	   
	   // Getters & Setters
	   public String getName() {
	      return name;
	   }
	   public String getAddress() {
	      return address;
	   }
	   //toString
	   public String toString() {
	      return name + "(" + address + ")";
	   }
	}