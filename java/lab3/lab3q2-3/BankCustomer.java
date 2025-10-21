// Student Name     : Emma Brennan
// Student Id Number: C00313274
// Date 	     	: 2-October-2025
// Lab				: Lab 3/Exercise 3
// Purpose 	        : Class, each BankCustomer has up to 3 SavingsAccounts

//SavingsAccount class definition
public class BankCustomer
{ // begin class BankCustomer
    private String name;
    private String address;
    private int savingsAccountsCount = 0; // track how many savingAccounts have been added to the customer
    private SavingsAccount[] savingsAcc = new SavingsAccount[3]; // Store the savingAccounts that have been added to the customer
    private double balance = 0;

    public BankCustomer(String name, String address) // constructor
    {
        this.name = name;
        this.address = address;
    }

    public String getName() // returns customer name
    {
        return this.name;
    }

    public void setName(String name) // set customer name
    {
        this.name = name;
    }

    public String getAddress() // returns customer address
    {
        return this.address;
    }

    public void setAddress(String address) // set customer name
    {
        this.address = address;
    }

    public void addAccount(SavingsAccount savingsAcc) // create a SavingsAccount for this customer
    {
        this.savingsAcc[savingsAccountsCount] = savingsAcc;
        savingsAccountsCount++;
    }

    public SavingsAccount[] getSavAccs() // returns the array of accounts
    {
        return savingsAcc;
    }

    public double balance() // calculate and return total savings for the customer
    {   
        for (SavingsAccount savAcc: savingsAcc)  // for (type variableName : arrayName)
        {
            if(savAcc !=null) 
            {
                balance += savAcc.getSavingsBalance();
            }
        }
        return balance;
    }

    // To String
    public String getSummary() // summary of account number and balance
    {
        String output = "";
        for (SavingsAccount savAcc: savingsAcc)  // for (type variableName : arrayName)
        {
            if(savAcc !=null) 
            {
                output += "Account Number: " + savAcc.getAccountNum() + "\n";
                output += "Balance: " + savAcc.getSavingsBalance() + "\n";
            }
        }
        return output;
    }
}