// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	     	: 2-October-2025
// Lab				: Lab 3/Exercise 1
// Purpose 	        : Driver program, prints the time every second until the minute elapses.

package lab3q1;
import java.util.Calendar;

//Driver program to test the Time class.
public class Clock
{
	public static void main (String args[]) throws InterruptedException 
	{
		Calendar cal = Calendar.getInstance(); // construct a Calendar object
		Time t = new Time (Calendar.HOUR_OF_DAY, cal.get(Calendar.MINUTE), cal.get(Calendar.SECOND)); //get the current time in hour and mins
		long startMillis = 0;
		long currentMillis = 0;

		// Get the current time in milliseconds
		startMillis = System.currentTimeMillis(); 
		currentMillis = System.currentTimeMillis();
		while (true) // run until the current minute advances
		{
			if (currentMillis >= startMillis + 1000) // when 1 second has passed
			{
				t.tick(); // advance 1 second
				System.out.println(t.toString()); // print the stored time
				startMillis = System.currentTimeMillis(); // reset milisec start time
				currentMillis =  System.currentTimeMillis(); // reset current millisec counter
			}
			currentMillis = System.currentTimeMillis(); // update the millisec counter

			// when the minute advances, end the loop
			if (t.getSecond() == 0) // this check goes here to make sure it isn't called early, at the start of the minute
			{
				break;
			}
		}
		
		

	}
}