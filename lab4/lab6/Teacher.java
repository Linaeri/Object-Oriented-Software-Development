// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 21-October-2025
// Lab		    	: Lab 6/Exercise 1
// Purpose 	    	: Defines a Teacher subclass


package lab6;

public class Teacher extends Person{
	   // Variables
	   int numCourses = 0;
	   String courses[] = new String[10];
	   
	   // Constructors
	   public Teacher(String name, String address) 
	   {
	      super(name, address);
	   }
	   
	   // Getters & Setters
	   public boolean addCourse(String course)
	   {
			if (numCourses < courses.length) // Error checking if array is full
			{
				courses[numCourses] = course;
				numCourses++;
				return true;
			}
			else
			{
				return false;
			}
	   }

	   public boolean removeCourse(String course)
	   {
			// search array for course index
			int position = 0;
			int index = 0;
			Boolean found = false; // whether course is found in the array

			while (index < numCourses && !found) // search for the course
			{
				if (courses[index].equalsIgnoreCase(course)) // when matched
				{
					position = index; // save the index
					found = true;
				}
			}

			if (found)
			{
				// Left-shift array
				for (int i = position; i < numCourses; i++)
				{
					courses[i] = courses[i+1];
					numCourses--;
				}
				return true; // course was deleted
			}
			else // course not found / no courses were added
			{
				return false; // course wasn't deleted
			}
			

	   }

	   //toString
	   public String toString() 
	   {
	      return ("Teacher: " + super.getName() + "(" + super.getAddress() + ")");
	   }
	}