// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 18-November-2025
// Lab		    	: Lab 8/Exercise 1
// Purpose 	    	: Sphere class



public class Sphere extends ThreeDShape {
	
	private double radius;
	

	public Sphere(String name, String colour, double radius) {
		super(name, colour);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return  4 * Math.PI * Math.pow(radius, 2);
	}


	@Override
	public double volume() {
		return 4.0/3.0 * Math.PI  * Math.pow(radius, 3);
	}

	@Override
	public String toString() {
		return (super.toString() + "\nRadius = " + radius);
	}
	
}