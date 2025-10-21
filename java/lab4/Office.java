// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    : 9-October-2025
// Lab		    : Lab 4/Exercise 1
// Purpose 	    : Office class

/* 
        - Employees are assigned to an existing Office (maximum 2 people in an office)
        - Returns the number of employees assigned to it
        - Room numbers start from 100 (static class variable)
        - toString method 
*/

public class Office {
    
        // Variables
        private static int nextRoomNumber = 100; // Static variable for room numbers
        private int roomNumber; // room number for this office object
        private Employee[] assignedEmployees = new Employee[2]; // Maximum of 2 employees
        private int assignedEmployeeCount = 0; // How many employees are assigned to this office
        

        // Constructors
        public Office()
        {
                this.roomNumber = nextRoomNumber;
                nextRoomNumber++;
        }

        public Office(Employee employee) // create office and assign an employee
        {
                this.roomNumber = nextRoomNumber;
                nextRoomNumber++;
                assignedEmployees[0] = employee;
        }

        // Getters and Setters
        public int getRoomNumber()
        {
                return roomNumber;
        }

        public int getNumAssignedEmployees() // how many employees are currently assigned to this office
        {
                return assignedEmployeeCount;
        }

        public Employee[] getAssignedEmployees() // return the employees assigned to this office
        {
                return assignedEmployees;
        }

        

        // Add Employee to office, if it isn't full
        public void addToOffice(Employee employee)
        {
                if (assignedEmployeeCount < 2)
                {
                        assignedEmployees[assignedEmployeeCount] = employee;
                        assignedEmployeeCount++;
                        employee.setOfficeRoomNumber(this.roomNumber); // set the employee's office room number to this office
                }
                else
                {
                        System.out.println("Office " + roomNumber + " is full. Cannot add more employees.");
                }
                
        }


        // toString 
        public String toString()
        {
                return ("Office Room Number: " + roomNumber);
        }

        // Other methods
        // a method to return the record of each employee assigned to the office
        public String getEmployeeRecords ()
        {
                String records = "";
                if (assignedEmployeeCount == 0)
                {
                        return ("No employees assigned to this office.");
                }
                else 
                {
                        for (Employee employee : assignedEmployees) // goes throug each element in the assignedEmployees array and returns the toString of each employee
                        {
                                records += employee.toString() + "\n\n"; // add to the return string, with spacing
                        }
                }
                return records;
        }
        
        
        
}