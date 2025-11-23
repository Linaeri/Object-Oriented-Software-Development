// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 18-November-2025
// Lab		    	: Lab 8/Exercise 1
// Purpose 	    	: 2D shape class

public abstract class TwoDShape extends Shape
{
	public TwoDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double area();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}