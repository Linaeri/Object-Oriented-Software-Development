// Student Name 	: Emma Brennan
// Student Id Number: C00313274
// Date 			: 25-September-2025
// Purpose 			: Implements a Rectangle class
// Changes			: Implements the printRectangle() method

public class Rectangle3
{
    private int length;
    private int width;
    private int area;
    private int perimeter;
    
    public Rectangle3() // constructor
    {
        setLength(1); // default to 1
        setWidth(1);
    }

    public Rectangle3(int theLength, int theWidth) // Second constructor which takes (roomNumber, roomType, occupied, rate)
    {
        setLength(theLength);
        setWidth(theWidth);
        
    }

    public void printRectangle()
    {
        int indexL;
        int indexW;

        System.out.println(); // newline
        //  print the first row of the width
        for (indexW=0; indexW < width; indexW++) 
        {
            System.out.print("* ");
        }
        

        // print the middle rows
        for (indexL=0; indexL < length-2; indexL++) // 2 length is subtracted because of the width rows
        {
            System.out.println(); // newline
            System.out.print("* ");

            // Add space for the center of the rectangle
            for (indexW=0; indexW < width-2; indexW++) // subtract 2 from width as covered by length 
            {
                System.out.print("  ");
            }
            System.out.print("* ");
        }
        System.out.print("\n");

        // print the bottom row of the width
        for (indexW=0; indexW < width; indexW++)
        {
            System.out.print("* ");
        }
    }

    public int getArea() // get the rectangle area
    {
        area = length*width; // calc the area
        return area;
    }

    public int getPerimeter() // get the rectangle perimeter
    {
        perimeter = 2*(length+width); // calc the perimeter
        return perimeter;
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