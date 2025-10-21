// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	        : 21-October-2025
// Lab		        : Lab 5/Exercise 1
// Purpose 	        : A test driver program for the Circle and Point inheritance

public class MyFirstCircle {
    public static void main (String args[])
    {
        Point myPoint = new Point(10, 20);
        Circle myCircle = new Circle(15, 30, 5);
        System.out.println("Point details : " + 
        myPoint);
        System.out.println("Circle details: " + 
        myCircle);
    }
}
