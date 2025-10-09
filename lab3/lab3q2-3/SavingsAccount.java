// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	     	: 2-October-2025
// Lab				: Lab 3/Exercise 2
// Purpose 	        : Class, functionality for a savings account including monthly interest calculation

//SavingsAccount class definition
public class SavingsAccount
{ // begin class SavingsAccount
    private static int nextAccountNum = 0; // shared by all objects
    private int accountNum; // unique to this object
    private static double annualInterestRate = 0.0; // shared interest rate
    private double savingsBalance; // amount the saver has on deposit
    

    //Constructor
    public SavingsAccount() // constructor
    { 
        nextAccountNum++;
        setAccountNum(nextAccountNum);
        
    }

    public void finalize() // handles cleanup on deletion
    {
        nextAccountNum--;
    }

    // Setters & getters
    private void setAccountNum(int accountNum) // set the account number, using the static nextAccountNum variable
    {
        this.accountNum = accountNum;     
    }

    public int getAccountNum() // get the account number
    {
        return accountNum;
    }

    public static void modifyAnnualInterestRate(double annualInterestRate)
    {
        SavingsAccount.annualInterestRate = annualInterestRate; // set the shared variable
    }

    public static double getAnnualInterestRate() // get the shared variable
    {
        return annualInterestRate;
    }

    public double getSavingsBalance()
    {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    // Calc method
    public void calculateMonthlyInterest() // calcualte and add the monthly interest to the balance
    {
        savingsBalance += (getSavingsBalance() * (annualInterestRate/12));
    }

    // To String
    public String toString()
    {
        return "SavingsAccount [Account number: " + accountNum + " Savings balance: " + savingsBalance + "]";
    }



    /* q3 class
       public double balance(SavingsAccount[] savaccs){

		double balance=0;

		for(SavingsAccount sav: savaccs){

			if(sav !=null) balance += sav.getSavingsBalance();

		}

		return balance;

	}
     
     */
}