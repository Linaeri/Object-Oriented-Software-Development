// Student Name 	: Emma Brennan
// Student Id Number: C00313274
// Date 			: 25-September-2025
// Purpose 			: Implements a HotelRoom class, used to manage he rooms in a hotel.
// Changes          : Implement occupation status and nightly rate per room.

public class HotelRoom2 
{
    private int roomNumber;
    private String roomType;
    private int roomVacancy; // 0 means vacant, 1 means occupied
    private double roomRate; //  nightly rate for each room

    public HotelRoom2() // constructor (takes no arguments)
    {

    }

    public void setRoomNumber(int roomNum) // set the room number
    {
        roomNumber = roomNum;
    }

    public int getRoomNumber() // get the room number
    {
        return roomNumber;
    }

    public void setRoomType(String type) // set the room type
    {
        roomType = type;
    }

    public String getRoomType() // get the room type
    {
        return roomType;
    }
    
    public void setRoomVacancy(int vacancy) // set the room vacancy
    {
        roomVacancy = vacancy;
    }

    public int getRoomVacancy() // get the room vacancy
    {
        return roomVacancy;
    }

    public void setRoomRate(double rate) // set the room rate
    {
        roomRate = rate;
    }

    public double getRoomRate() // get the room rate
    {
        return roomRate;
    }
    
} // end class HotelRoom