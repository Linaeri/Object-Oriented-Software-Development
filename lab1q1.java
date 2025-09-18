// Student Name 	: Emma Brennan
// Student Id Number: C00313274
// Date 			: 18-September-2025
// Purpose 			: Creates two instances of the thermometer class and sets the value of celsius with different constructors in the thermometer class.

public class lab1q1
{ // begin class lab1q1 (ThermTest)
	public static void main(String args[]) 
	{ // being main method

		Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class - using first constructor
        Thermometer thermB = new Thermometer(10); // A) Create a new instance, thermB - using 2nd constructor
        // B) ThermB is instantiated to 10 degrees using the 2nd constructor

        double tempB; // C) get the temperature and store in tempB
        tempB = thermB.getCelsius();

		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		thermA.setCelsius(20.0);
		System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

        System.out.println("Temp. of Thermometer B is " + tempB ); // D) Print the value of tempB to screen
		
	} // end main
} // end class ThermTest