// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    : 9-October-2025
// Lab		    : Lab 4/Exercise 1
// Purpose 	    : Address class

/* 
        - They should have an address consisting of
        o Street
        o City/town
        o County

        - toString method 

        */

public class Address{
    
        // Variables
        private String street; 
        private String city; // City/town
        private String county;

        // Constructor, no parameters
        public Address()
        {

        }

        // Constructor with parameters
        public Address(String street, String city, String county)
        {
                this.street = street;
                this.city = city;
                this.county = county;
        }

        // Getters and Setters
        public void setStreet(String street)
        {
                this.street = street;
        }

        public void setcity(String city)
        {
                this.city = city;
        }

        public void setcounty(String county)
        {
                this.county = county;
        }

        public String getStreet()
        {
                return street;
        }

        public String getcity()
        {
                return city;
        }

        public String getCounty()
        {
                return county;
        }

        // toString 
        public String toString() // Override default toString method
        {
                return("Street: " + street + ", City/Town: " + city + ", County: " + county);
                
        }


}
