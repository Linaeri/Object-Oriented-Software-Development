// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 25-November-2025
// Lab		    	: Lab 8/Exercise 2
// Purpose 	    	: TestPerson driver program

public class TestPerson{
	

	public static void main(String[] args)
	{
		// Variables
		Person[] persons = new Person[2]; // polymorphic array
		int personCount;

		persons[0] = new Employee("Michael", 45000.0);
		persons[1] = new Student("Elise", "Game Development");
		personCount = 2;

		// print name and descriptions of Persons
		System.out.println("Name: " + persons[0].getName() + ", Description: " + persons[0].getDescription());
	System.out.println("Name: " + persons[1].getName() + ", Description: " + persons[1].getDescription());
	}
}