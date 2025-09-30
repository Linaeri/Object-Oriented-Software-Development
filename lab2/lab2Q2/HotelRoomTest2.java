// Student Name 	: Emma Brennan
// Student Id Number: C00313274
// Date 			: 25-September-2025
// Purpose 			: Creates two instances of the HotelRoom class, assigns room details and prints them
// Changes          : Instanstiate occupation status and nightly rate per room.

public class HotelRoomTest2
{ // begin class lab2q2 (HotelRoom)
	public static void main(String args[]) 
	{ // being main method

        HotelRoom2 roomA = new HotelRoom2(); // create a new instance of HotelRoom
        HotelRoom2 roomB = new HotelRoom2(); // create a new instance of HotelRoom

        roomA.setRoomNumber(200); // set the roomA variables
        roomA.setRoomType("Single");
        roomA.setRoomVacancy(1); // set roomA to occupied
        roomA.setRoomRate(100.00); // set nightly rate to 100

        roomB.setRoomNumber(201); // set the roomB variables
        roomB.setRoomType("Double");
        roomB.setRoomVacancy(0); // set roomB to unoccupied
        roomB.setRoomRate(80.00); // set nightly rate to 100

        //print to screen
        System.out.println("Number of room A is " + roomA.getRoomNumber());
        System.out.println("Type of room A is " + roomA.getRoomType());
        System.out.println("Occupation status of room A is " + roomA.getRoomVacancy());
        System.out.println("Nightly rate of room A is " + roomA.getRoomRate());
        System.out.println("Number of room B is " + roomB.getRoomNumber());
        System.out.println("Type of room B is " + roomB.getRoomType());
        System.out.println("Occupation status of room B is " + roomB.getRoomVacancy());
	System.out.println("Nightly rate of room B is " + roomB.getRoomRate());

	} // end main
}  // end class



        // Thermometer thermB = new Thermometer(10); // A) Create a new instance, thermB - using 2nd constructor
        // // B) ThermB is instantiated to 10 degrees using the 2nd constructor

        // double tempB; // C) get the temperature and store in tempB
        // tempB = thermB.getCelsius();

		// System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
		// thermA.setCelsius(20.0);
		// System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );

        // System.out.println("Temp. of Thermometer B is " + tempB ); // D) Print the value of tempB to screen