// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 18-November-2025
// Lab		    	: Lab 8/Exercise 1
// Purpose 	    	: Circle class


public class Circle extends TwoDShape{
	private double radius;

	public Circle(String name, String color, double r){ 
		super(name, color);
		setRadius(r); 
		}

	public double getRadius(){ 
		return radius; 
		}

	public void setRadius(double r){
		radius = r; 
		}

	public double area(){ 
		return Math.PI * Math.pow(radius, 2);
		}

	public String toString() {		
		return (super.toString() + "\nRadius : " + radius);
	}

	protected String hello() {
		return "Hello";
		}
}