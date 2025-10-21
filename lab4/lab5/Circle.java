// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    : 21-October-2025
// Lab		    : Lab 5/Exercise 1
// Purpose 	    : A Circle class which is a subclass of Point, and has a radius

public class Circle extends Point{
    
        // Variables
        protected int radius;

        // Contructors
        public Circle()
        {
                super();
        }

        public Circle(int x, int y)
        {
                super(x, y);
        }

        public Circle(int x, int y, int radius)
        {
                super(x, y);
                this.radius = radius;
        }

        // Getters and setters
        public void setRadius(int radius)
        {
                this.radius = radius;
        }

        public int getRadius()
        {
                return radius;
        }

       

        // toString
        public String toString()
        {
                return ("X: " + x + ", Y: " + y + ", Radius: " + radius);
        }

}
