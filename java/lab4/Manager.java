// Student Name     : Emma Brennan
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

public class Manager extends Employee {

        // Variables
        private String companyCarBrand;
        private String companyCarRegPlate;

        // Constructors
        public Manager() 
        {
                super(); // call the Employee constructor
        }

        public Manager(Employee employee) // convert Employee to Manager
        {
                super(employee); // call the Employee constructor
        }

         public Manager(Employee employee, String companyCarBrand, String companyCarRegPlate) // convert Employee to Manager, with car details
        {
                super(employee); // call the Employee constructor
                this.companyCarBrand = companyCarBrand;
                this.companyCarRegPlate = companyCarRegPlate;
        }

        public Manager(String name, Address address, String employeeType, String companyCarBrand, String companyCarRegPlate) // all details
        {
                super(name, address, employeeType); // call the Employee constructor
                this.companyCarBrand = companyCarBrand;
                this.companyCarRegPlate = companyCarRegPlate;
        }

        public Manager(String name, Address address, String employeeType) // only Employee details
        {
                super(name, address, employeeType); // call the Employee constructor
        }
        // Getter and Setters
        public String getCompanyCarBrand()
        {
                return companyCarBrand;
        }

        public void setCompanyCarBrand(String companyCarBrand)
        {
                this.companyCarBrand = companyCarBrand;
        }

        public String getCompanyCarRegPlate()
        {
                return companyCarRegPlate;
        }

        public void setCompanyCarRegPlate(String companyCarRegPlate)
        {
                this.companyCarRegPlate = companyCarRegPlate;
        }

        // toString
        public String toString() // override Employee toString with Manager details
        {
                return("Employee Number: " + super.getEmployeeNumber() + "\nAddress: " + super.getAddress() + "\nOffice Room Number: " + super.getOfficeRoomNumber());
        }
}
