// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	     	     : 9-October-2025
// Lab				  : Lab 3/Exercise 3
// Purpose 	        : Driver, with 3 savings accounts added to a BankCustomer. Outputs total balances

//SavingsAccount class definition
public class BankCustomerDriver
{ // begin class BankCustomerDriver
    public static void main (String args[])
   {
      BankCustomer customer1 = new BankCustomer("Michael", "Kildare"); // create new customer

      SavingsAccount.modifyAnnualInterestRate(0.05); // set the yearly interest rate to 5%

      SavingsAccount deposits1 = new SavingsAccount(); // create new Savings account
      deposits1.setSavingsBalance(3500.00); //set savings account balance
      deposits1.calculateMonthlyInterest(); // calculate and add the interest 
      SavingsAccount deposits2 = new SavingsAccount(); // create new Savings account
      deposits2.setSavingsBalance(5000.00); //set savings account balance
      deposits2.calculateMonthlyInterest(); // calculate and add the interest 
      
      SavingsAccount deposits3 = new SavingsAccount(); // create new Savings account
      deposits3.setSavingsBalance(10000.00); //set savings account balance
      deposits3.calculateMonthlyInterest(); // calculate and add the interest 

      customer1.addAccount(deposits1); // add the account to the customer
      customer1.addAccount(deposits2); // add the account to the customer
      customer1.addAccount(deposits3); // add the account to the customer

      // print out the details:
      System.out.println("Customer: " + customer1.getName());
      System.out.println("Savings Total: " + customer1.balance());
      System.out.println("Summary:\n" + customer1.getSummary());

   }
 }



