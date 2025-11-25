// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 25-November-2025
// Lab		    	: Lab 8/Exercise 2
// Purpose 	    	: Student concrete class



public class Student extends Person {
	
	// Variables
	private String course;
	
	// Constructor
	public Student(String name, String course) {
		super(name);
		setCourse(course);
	}

	// Getters and Setters
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	// Implement abstract superclass method
	public String getDescription()
	{
		return ("A student studying " + course);
	}
	
}