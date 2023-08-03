package Thursdaylab_3Aug;
public abstract class BankAccount 
{
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}