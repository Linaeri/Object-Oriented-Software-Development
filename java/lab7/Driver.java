// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	    	: 11-November-2025
// Lab		    	: Lab 7/Exercise 1
// Purpose 	    	: Test driver program for Vet

package lab7;
import java.util.Scanner;

public class Driver {


	public static void main(String[] args) {
	    Animal[] animals = new Animal[4];
		int animalsCount = 0;
		Vet vet = new Vet("Marisse");
		Scanner scan = new Scanner(System.in);
		int menuChoice = 0;

		String name = "";
		String breed = "";
		int age = 0;	
		char gender = 'M';
		int vaccinateNum;
		
		while (menuChoice != 4 || menuChoice < 1 || menuChoice > 4) {
			System.out.println("1. Add dog\n2. Add cat\n3. Vaccinate animal\n4. Quit");
			System.out.print("Choose from the menu (1-4): ");
			menuChoice = scan.nextInt();
			scan.nextLine(); // clear input buffer

			// Enter new animal details
			if (menuChoice == 1 || menuChoice == 2){ 
					System.out.print("Enter name: ");
					name = scan.nextLine();
					System.out.print("Enter breed: ");
					breed = scan.nextLine();
					System.out.print("Enter age: ");
					age = scan.nextInt();
					scan.nextLine();
					System.out.print("Enter gender (M/F): ");
					gender = Character.toUpperCase(scan.next().charAt(0)); // convert scanner input to char and capitalise
					System.out.println();
				}

			// create new dog/cat or vaccinate
			switch (menuChoice){
				case 1: 
					animals[animalsCount] = new Dog(name, breed, age, gender);
					animalsCount++;
					break;
				case 2:
					animals[animalsCount] = new Cat(name, breed, age, gender);
					animalsCount++;
					break;
				case 3:
					for (int i=0;i<animalsCount;i++)
					{
						System.out.println((i+1) + ". " + animals[i].toString());
						
					}
					System.out.print("Choose animal to vaccinate (1-4): ");
					vaccinateNum = scan.nextInt();
					vet.Vaccinate(animals[vaccinateNum-1]);
					break;
				case 4:
					System.out.println("Bye!");
			}
		}
		

	}

}