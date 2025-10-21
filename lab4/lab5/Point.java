// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    : 21-October-2025
// Lab		    : Lab 5/Exercise 1
// Purpose 	    : A Point class to describe a point in 2D space

public class Point {
    
        // Variables
        // protected: can only be accessed in the same package and by subclass
        protected int x; 
        protected int y;

        // Contructors
        public Point()
        {

        }

        public Point(int x, int y)
        {
                this.x = x;
                this.y = y;
        }

        // Getters and setters
        public void setX(int x)
        {
                this.x = x;
        }

        public void setY(int y)
        {
                this.y = y;
        }

        public int getX()
        {
                return x;
        }

        public int getY()
        {
                return y;
        }

        // toString
        public String toString()
        {
                return ("X: " + x + ", Y: " + y);
        }

}
