package Thursdaylab_3Aug;
public class CheckingAccount extends BankAccount
{
	public CheckingAccount(String accountNumber,double balance) {
        super(accountNumber,balance);
    }
	
    @Override
    public void deposit(double amount) 													//abstract method deposit reused here
    {
        balance+=amount;
        System.out.println("Deposited "+amount+". New balance: "+balance);
    }
    
    @Override
    public void withdraw(double amount) 												//withdraw function which is reused here 
    {
        if (amount<=balance)
        {
            balance-=amount;
            System.out.println("Withdrew "+amount+". New balance: "+balance);
        } 
        else																			//if the amount is low than cancel the process.
        {
            System.out.println("Insufficient funds. Withdrawal cancelled.");
        }
    }
}