// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	     	: 9-October-2025
// Lab				: Lab 4/Exercise 1
// Purpose 	        : A rudimentary HR system to manage employee details 
//                    Tests understanding of classes and aggregation

/*  1. list all offices
    2. create a new employee record
    3. list all employees

        - initialises 3 office records automatically. 
        They should have room numbers starting at 100 (allocated from a static class variable)

        - The user can create up to a maximum of 5 employee records
        - must have Address
        - They must be assigned to an existing Office (maximum 2 people in an office)

        */
    import java.util.Scanner;
    public class MyHrDriver {
        public static void main(String[] args)
        {
            /*  Give the user the following options:
                1. list all offices
                2. create a new employee record
                3. list all employees
            */
            // variables
            MyHr myHr = new MyHr();
            Scanner scan = new Scanner(System.in);
            int menuChoice = 0;
            Office[] offices = new Office[10]; // Space for 10 offices
            Employee[] employees = new Employee[5]; // Maximum of 5 employee records
            int employeeCount = 0; // How many employees currently exist
            int officeCount = 0; // How many offices currently exist
            String output = "";

            //initilaise 3 office records
            for (int i = 0; i < 3; i++) 
            {
                offices[i] = new Office();
                officeCount++;
            }

            // Menu loop
            while (menuChoice != 4) // 4 to exit
            {
            
            MyHr.printMenu();
            menuChoice = scan.nextInt();

                switch (menuChoice)
                {
                    case 1:
                        MyHr.listAllOffices(offices);
                        break;
                    case 2:
                        // Create a new employee record
                        if (employeeCount < 5) 
                        {
                            Employee currentEmployee = MyHr.addEmployee();
                            employees[employeeCount] = currentEmployee; // call method to create employee, then add it to the employees array
                            employeeCount++;

                            // Assign employee to an office
                            int officeToAssign = employeeCount / 2; //since 2 employees per office, will auto fill Offices
                        
                            offices[officeToAssign].addToOffice(currentEmployee);

                        }
                        else
                        {
                            System.out.println("Error: Maximum employee limit reached.");
                        }
                        break;
                    case 3:
                        // List all employees
                        System.out.println(myHr.listAllEmployees(employees));
                        break;
                    case 4:
                        // Exit
                        System.out.println("Exiting program!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }