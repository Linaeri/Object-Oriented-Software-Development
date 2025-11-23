// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 18-November-2025
// Lab		    	: Lab 8/Exercise 1
// Purpose 	    	: Shape class

public abstract class Shape
{
	private String name;
	private String colour;
	
	public Shape(String name, String colour)
  	{ 
  		this.name = name; 
  		this.colour = colour; 
  	} 
  	
  	
  	public abstract double area();
    
    public String toString()
  	{
  		return ("---\nShape Name = " + this.name + "\nShape colour = " + this.colour);
  	}
  	
}