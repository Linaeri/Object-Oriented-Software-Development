// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 25-November-2025
// Lab		    	: Lab 8/Exercise 2
// Purpose 	    	: Person abstract class

public abstract class Person
{
	// Variables
	private String name;
	
	// Constructor
	public Person(String name)
  	{ 
  		this.name = name; 
  	} 
  	
	// Getters and Setters
  	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// Abstract Method
  	public abstract String getDescription();
    
	// ToString
    public String toString()
  	{
  		return ("---\nPerson's Name = " + this.name);
  	}
  	
}