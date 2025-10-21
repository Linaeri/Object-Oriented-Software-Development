// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	     	: 9-October-2025
// Lab				: Lab 4/Exercise 1
// Purpose 	        : A rudimentary HR system to manage employee details 
//                    Tests understanding of classes and aggregation
// Class purpose: Functionality for simplyfying the HR driver program
import java.util.Scanner;
public class MyHr {

    // Constructors
    public MyHr() 
    {

    }

    // Getters and Setters

    // toString
    public static String toString(int officeCount, int employeeCount)
    {
        return ("Number of Offices: " + officeCount + "\nNumber of Employees: " + employeeCount);
    }

    // Other methods
    // 1. list all offices
        public static void listAllOffices(Office[] offices)
        {
            for (Office office : offices)
            {
                if (office != null)
                {
                    System.out.println(office.toString()); // returns the office number of all offices
                }
            }
        }

    // 2. create a new employee record
    public static Employee addEmployee()
    {   
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter employee name: ");
        String name = scan.nextLine();
        System.out.println("Please enter employee address: ");
        Address address = MyHr.createAdress();
        System.out.println("Please enter employee type: ");
        String type = scan.nextLine();

        // Add employee to the system (not shown)
        if (type.equalsIgnoreCase("manager"))
        {
            System.out.println("Please enter car brand: ");
            String carBrand = scan.nextLine();
            System.out.println("Please enter car registration plate: ");
            String carReg = scan.nextLine();

            return new Manager(name, address, type, carBrand,  carReg); // create the manager employee
        }
        else
        {
            return new Employee(name, address, type); // create the staff employee
        }

    }

    // 3. list all employees
    public static String listAllEmployees(Employee[] employees)
        {
            String record = "";
            for (Employee employee : employees)
            {
                if (employee != null)
                {
                    record += (employee.toString() + "\n\n"); // returns the employee details of all employees
                }
            }
            return record;
        }

    public static void printMenu()
    {
        System.out.println("Please select an option:");
        System.out.println("1. List all offices");
        System.out.println("2. Create a new employee record");
        System.out.println("3. List all employees");
        System.out.println("4. Exit");
    }

    public static Address createAdress()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter street: ");
        String street = scan.nextLine();
        System.out.println("Please enter city/town: ");
        String city = scan.nextLine();
        System.out.println("Please enter county: ");
        String county = scan.nextLine();

        Address address = new Address(street, city, county);
        return address;
    }
    

}