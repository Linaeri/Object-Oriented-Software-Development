// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 21-October-2025
// Lab		    	: Lab 6/Exercise 1
// Purpose 	    	: Defines a student subclass


package lab6;

public class Student extends Person {
	   // Variables
	   int numCourses = 0;
	   String[] courses = new String[10];
	   int[] grades = new int[10];
	   
	   // Constructors
	   public Student(String name, String address) 
	   {
			super(name, address);
	   }

	   // Getters & Setters
	   public void addCourseGrade(String course, int grade)
	   {
			courses[numCourses] = course;
			grades[numCourses] = grade;
			numCourses++;
			System.out.println(course + ":" + grade + " added.");
	   }

	   public double getAverageGrade()
	   {
			double total = 0;
			double average = 0;
			for (int grade : grades) // get the total of all grades
			{
				total += grade;
			}
			average = total/numCourses;
			return average;
	   }

	   // print methods
	   public void printGrades()
	   {
			String toString = toString();
			for (int i = 0; i < numCourses; i++)
			{
				toString += (" " + courses[i] + ":" + grades[i]);
			}

			System.out.println(toString);
	   }

	   //toString
	   public String toString() 
	   {
	      return ("Student: " + super.getName() + "(" + super.getAddress() + ")");
	   }
	}