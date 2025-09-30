// Student Name 	: Emma Brennan
// Student Id Number: C00313274
// Date 			: 25-September-2025
// Purpose 			: Implements a HotelRoom class, used to manage he rooms in a hotel.
// Changes          : Replace the vacancy int with boolean and write the method isOccupied() to prevent double booking of a room

public class HotelRoom4 
{
    private int roomNumber;
    private String roomType;
   // private int roomVacancy; // 0 means vacant, 1 means occupied
    private double roomRate; //  nightly rate for each room
    private boolean isOccupied; // true if a room is already booked

    public HotelRoom4() // constructor (takes no arguments)
    {

    }

    public HotelRoom4(int roomNum, String type, boolean vacancy, double rate) // Second constructor which takes (roomNumber, roomType, occupied, rate)
    {
        setRoomNumber(roomNum);
        setRoomType(type);
        setOccupied(vacancy);
        setRoomRate(rate);

    }

    public boolean isOccupied() // returns true if room is occcupied
    {
        return isOccupied;
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
    
    public void setOccupied(boolean vacancy) // set the room occupation
    {
        isOccupied = vacancy;
    }

    public boolean getOccupied() // return the room vacancy as true or false, same as isOccupied()
    {
        return isOccupied;
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