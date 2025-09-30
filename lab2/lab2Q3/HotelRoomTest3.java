// Student Name         : Emma Brennan
// Student Id Number    : C00313274
// Date 	        : 25-September-2025
// Purpose 	        : Creates two instances of the HotelRoom class, assigns room details and prints them
// Changes              : Creates an instance, roomC object using the new constructor

public class HotelRoomTest3
{ // begin class lab2q3 (HotelRoom)
	public static void main(String args[]) 
	{ // being main method

        HotelRoom3 roomA = new HotelRoom3(); // create a new instance of HotelRoom
        HotelRoom3 roomB = new HotelRoom3(); // create a new instance of HotelRoom
        HotelRoom3 roomC = new HotelRoom3(202, "Single", 0, 90.00); // using the seconds constructor

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
        System.out.println("Number of room C is " + roomC.getRoomNumber());
        System.out.println("Type of room C is " + roomC.getRoomType());
        System.out.println("Occupation status of room C is " + roomC.getRoomVacancy());
	System.out.println("Nightly rate of room C is " + roomC.getRoomRate());

	} // end main
}  // end class