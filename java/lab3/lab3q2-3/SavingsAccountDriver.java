// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	     	: 2-October-2025
// Lab				: Lab 3/Exercise 2
// Purpose 	        : Driver program, instantiates 2 savingsAccount objects


//Driver program to test the SavingsAccount class.
public class SavingsAccountDriver
{
	public static void main (String args[]) throws InterruptedException 
	{

		// instantiate SavingsAccounts
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		// set savings balances
		saver1.setSavingsBalance(2000.0);
		saver2.setSavingsBalance(3000.0);

		//calcualte month 1 interest and output balances
		SavingsAccount.modifyAnnualInterestRate(0.04); // set to 4%
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());

		//calcualte month 2 interest and output balances
		SavingsAccount.modifyAnnualInterestRate(0.05); // set to 5%
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		
	}
}