// Student Name 	: Emma Brennan
// Student Id Number: C00313274
// Date 			: 25-September-2025
// Purpose 			: Creates two instances of the HotelRoom class, assigns room details and prints them


public class HotelRoomTest1
{ // begin class lab2q1 (HotelRoom)
	public static void main(String args[]) 
	{ // being main method

        HotelRoom1 roomA = new HotelRoom1(); // create a new instance of HotelRoom
        HotelRoom1 roomB = new HotelRoom1(); // create a new instance of HotelRoom

        roomA.setRoomNumber(200); // set the roomA variables
        roomA.setRoomType("Single");

        roomB.setRoomNumber(201); // set the roomB variables
        roomB.setRoomType("Double");

        //print to screen
        System.out.println("Number of room A is " + roomA.getRoomNumber());
        System.out.println("Type of room A is " + roomA.getRoomType());
        System.out.println("Number of room B is " + roomB.getRoomNumber());
        System.out.println("Type of room B is " + roomB.getRoomType());
		
	} // end main
}  // end class

