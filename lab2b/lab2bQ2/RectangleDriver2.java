// Student Name         : Emma Brennan
// Student Id Number    : C00313274
// Date 	        : 25-September-2025
// Purpose 	        : Constructs a Rectangle class for test purposes
// Changes			: Calls the getArea and getPerimeter methods.

public class RectangleDriver2
{ // begin class lab2q3 (HotelRoom)
	public static void main(String args[]) 
	{ // being main method

        Rectangle2 rectangle = new Rectangle2(5, 10); // create a new instance of Rectangle
       
		System.out.println("Area is: " + rectangle.getArea()); //output area
		System.out.println("Perimeter is: " + rectangle.getPerimeter()); // output perimeter

        System.out.println(rectangle.toString()); // return output string


	} // end main
}  // end class
