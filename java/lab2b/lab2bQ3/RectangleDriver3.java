// Student Name         : Emma Brennan
// Student Id Number    : C00313274
// Date 	        : 25-September-2025
// Purpose 	        : Constructs a Rectangle class for test purposes
// Changes			: Calls the printRectangle() method

public class RectangleDriver3
{ // begin class lab2q3 (HotelRoom)
	public static void main(String args[]) 
	{ // being main method

        Rectangle3 rectangleA = new Rectangle3(5, 10); // create a new instance of Rectangle
		Rectangle3 rectangleB = new Rectangle3(7, 5); // create a new instance of Rectangle
		Rectangle3 rectangleC = new Rectangle3(12, 15); // create a new instance of Rectangle

		System.out.println("Area is: " + rectangleA.getArea()); //output area
		System.out.println("Perimeter is: " + rectangleA.getPerimeter()); // output perimeter

        System.out.println(rectangleA.toString()); // return output string
		rectangleA.printRectangle();
		rectangleB.printRectangle();
		rectangleC.printRectangle();


	} // end main
}  // end class
