// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 18-November-2025
// Lab		    	: Lab 8/Exercise 1
// Purpose 	    	: Cylinder class


public class Cylinder extends ThreeDShape
{
	private double height;
	private double radius;

	public Cylinder(String name, String color, double r, double h){ 
		super(name, color);
		setRadius(r); 
		setHeight(h);
	}

	public void setHeight(double h){ 
		height = h; 
	}

	public double getHeight(){ 
		return height;
	}

	public double volume(){ 
		return 2 * area() + 
		2 * Math.PI * radius * height; 
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
		return (super.toString() + "\nHeight : " + height);
	}

}