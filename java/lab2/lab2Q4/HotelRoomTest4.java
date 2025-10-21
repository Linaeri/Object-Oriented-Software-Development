// Student Name         : Emma Brennan
// Student Id Number    : C00313274
// Date 	        : 25-September-2025
// Purpose 	        : Creates two instances of the HotelRoom class, assigns room details and prints them
// Changes              : Creates an instance, roomC object using the new constructor

public class HotelRoomTest4
{ // begin class lab2q3 (HotelRoom)
	public static void main(String args[]) 
	{ // being main method

        HotelRoom4 roomA = new HotelRoom4(); // create a new instance of HotelRoom
        HotelRoom4 roomB = new HotelRoom4(); // create a new instance of HotelRoom
        HotelRoom4 roomC = new HotelRoom4(202, "Single", false, 90.00); // using the seconds constructor

        roomA.setRoomNumber(200); // set the roomA variables
        roomA.setRoomType("Single");
        if (roomA.isOccupied() == false) // check roomA is vacant
        {
                roomA.setOccupied(true); // set roomA to occupied
        }
        else 
        {
                System.out.println("Room A is already booked");
        }
        if (roomA.isOccupied() == false) // check roomA is vacant
        {
                roomA.setOccupied(true); // set roomA to occupied again, should print error message
        }
        else 
        {
                System.out.println("Room A is already booked");
        }
        roomA.setRoomRate(100.00); // set nightly rate to 100

        roomB.setRoomNumber(201); // set the roomB variables
        roomB.setRoomType("Double");
        roomB.setOccupied(false); // set roomB to unoccupied
        roomB.setRoomRate(80.00); // set nightly rate to 100

        //print to screen
        System.out.println("Number of room A is " + roomA.getRoomNumber());
        System.out.println("Type of room A is " + roomA.getRoomType());
        System.out.println("Occupation status of room A is " + roomA.getOccupied());
        System.out.println("Nightly rate of room A is " + roomA.getRoomRate());
        System.out.println("Number of room B is " + roomB.getRoomNumber());
        System.out.println("Type of room B is " + roomB.getRoomType());
        System.out.println("Occupation status of room B is " + roomB.getOccupied());
	System.out.println("Nightly rate of room B is " + roomB.getRoomRate());
        System.out.println("Number of room C is " + roomC.getRoomNumber());
        System.out.println("Type of room C is " + roomC.getRoomType());
        System.out.println("Occupation status of room C is " + roomC.getOccupied());
	System.out.println("Nightly rate of room C is " + roomC.getRoomRate());

	} // end main
}  // end class