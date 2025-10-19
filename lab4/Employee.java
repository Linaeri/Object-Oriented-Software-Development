
// Student Id Number: C00313274
// Date 	    : 9-October-2025
// Lab	            : Lab 4/Exercise 1
// Purpose 	    : Employee class

/* 
        -Each employee should have an automatically assigned employee number,
        starting at employee number 1000

        - They should have an address consisting of
        o Street
        o City/town
        o County

        - They should have an employee type of either “Staff” or “Manager"

        -If they are a “Manager” then they should have some details about their
        company car

        - They must be assigned to an existing Office (maximum 2 people in an office)

        - a method to return the number of employee records
        */

public class Employee {
    
        // Variables
        private static int nextEmployeeNumber = 1000; //Each employee should have an automatically assigned employee number
        private int employeeNumber; // this object's employee number
        private Address address; // Object containing address variables
        private int officeRoomNumber; // Which office the employee is assigned to
        private String employeeType; // Staff or Manager
        private String name;

        // Constructor
        public Employee()
        {
                // Assign an employee number from the static class variable and increment it.
                this.employeeNumber = nextEmployeeNumber;
                nextEmployeeNumber++;
        }

         public Employee(Employee employee) // for converting an Employee to a Manager - currently unused in the driver
        {
                // Reassign the number already used by the Employee before it became a Manager
                this.employeeNumber = employee.getEmployeeNumber();
                this.employeeType = employee.getEmployeeType();
                this.name = employee.getName();
                this.address = employee.getAddress();
                this.officeRoomNumber = employee.getOfficeRoomNumber();       
        }

         public Employee(String name, Address address, String employeeType)
        {
                // Assign an employee number from the static class variable and increment it.
                this.employeeNumber = nextEmployeeNumber;
                nextEmployeeNumber++;
                this.name = name;
                this.address = address;
                this.employeeType = employeeType;
        }

        // Getters and Setters
        public int getEmployeeNumber()
        {
                return employeeNumber;
        }

        public int getNumEmployeeRecords() // method to return the number of employee records
        {
                return (nextEmployeeNumber - 1000); // since employee numbers start at 1000
        }

        public String getEmployeeType() // returns Staff or Manager
        {
                return employeeType;
        }
        
        public void setEmployeeType(String employeeType) // input Staff or Manager
        {
                this.employeeType = employeeType;
                if (employeeType.equals("Manager"))
                {

                }
        }

        public void setName(String name)
        {
                this.name = name;
        }

        public String getName()
        {
                return name;
        }

        public void setAddress(Address address)
        {
                this.address = address;
        }

        public Address getAddress()
        {
                return address;
        }

        public int getOfficeRoomNumber()
        {
                return officeRoomNumber;
        }

        public void setOfficeRoomNumber(int officeRoomNumber)
        {
                this.officeRoomNumber = officeRoomNumber;
        }

        // toString 
        public String toString()
        {
                return("Employee Number: " + employeeNumber + "\nName: " + name + "\nType: " + employeeType + "\nAddress: " + address + "\nOffice Room Number: " + officeRoomNumber);
        }

}
