// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 18-November-2025
// Lab		    	: Lab 8/Exercise 1
// Purpose 	    	: 3D shape class

public abstract class ThreeDShape extends Shape
{
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
 
  	public abstract double volume();
  	
  	public String toString()
  	{
  		return (super.toString());
  	}
}