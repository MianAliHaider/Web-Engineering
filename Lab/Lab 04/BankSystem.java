import java.util.*;

class InsufficientFundsException extends Exception
{
	String value;

    InsufficientFundsException(String v)
    {
        value=v;		
    }
	public String toString()
    {
        return "NewException " + value;
    }
}
class BankAccount
{
	double accountNumber;
	double balance;
	
	public BankAccount(double accountNumber,double balance)
	{
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		System.out.println("Your amount befor deposited amount is: "+ balance);
		balance=balance+amount;
		System.out.println("Your amount after deposited amount is: "+balance);
	}
	
	public void withdraw(double amount) throws InsufficientFundsException
	{
		if (balance < amount)
		{
			throw new InsufficientFundsException("Funds is not available. Your balance is: "+balance);
		}
		balance=balance-amount;
		System.out.println("Your Remaining Amount is: "+balance);
	}
}

class BankSystem
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Account Number: ");
		double accno=in.nextDouble();
		System.out.println("Enter the Balance in your account: ");
		double balance=in.nextDouble();
		
		BankAccount acc = new BankAccount(accno,balance);
		try
		{
            System.out.print("Enter amount to withdraw: ");
            double amount = in.nextDouble();
            acc.withdraw(amount);
        } 
		catch(InsufficientFundsException e) 
		{
            System.out.println("Exception: " + e);
        } 
		finally 
		{
            System.out.println("Transaction complete.");
        }
	}
}
