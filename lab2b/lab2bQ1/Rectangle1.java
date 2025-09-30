// Student Name 	: Emma Brennan
// Student Id Number: C00313274
// Date 			: 25-September-2025
// Purpose 			: Implements a Rectangle class

public class Rectangle1
{
    private int length;
    private int width;
    
    public Rectangle1() // constructor
    {
        setLength(1); // default to 1
        setWidth(1);
    }

    public Rectangle1(int theLength, int theWidth) // Second constructor which takes (roomNumber, roomType, occupied, rate)
    {
        setLength(theLength);
        setWidth(theWidth);
        
    }

    public void setLength(int theLength) // set the rectangle length
    {
        if (theLength > 0 && theLength <= 40)
        {
            length = theLength;
        }
        
    }

    public void setWidth(int theWidth) // set the rectangle width
    {
        if (theWidth > 0 && theWidth <= 40)
        {
            width = theWidth;
        }
        
    }

    public int getLength() // get the rectangle length
    {
        return length;
    }

     public int getWidth() // get the rectangle width
    {
        return width;
    }

    public String toString() // toString method
    {
        return "Length = " + length + ", Width = " + width;
    }
    
    
} // end class HotelRoom