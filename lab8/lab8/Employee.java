// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 25-November-2025
// Lab		    	: Lab 8/Exercise 2
// Purpose 	    	: Employee concrete class



public class Employee extends Person {
	
	// Variables
	private double annualSalary;
	
	// Constructor
	public Employee(String name, double annualSalary) {
		super(name);
		setAnnualSalary(annualSalary);
	}

	// Getters and Setters
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	// Implement abstract superclass method
	public String getDescription()
	{
		return ("An employee with a salary of " + annualSalary);
	}
	
}