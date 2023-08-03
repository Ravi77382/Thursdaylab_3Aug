//Q.1 Create an abstract class called "BankAccount"  with attributes such as account number and balance, and abstract methods called "deposit" and "withdraw".Create a subclass called "CheckingAccount" that inherits from BankAccount and implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount class and call both the "deposit" and "withdraw" methods.
//3 Files: BankAccount.java, CheckingAccount.java, Process.java
package Thursdaylab_3Aug;
public abstract class BankAccount 									//Abstract class which has abstract and non-abstract methods.
{
    protected String accountNumber;
    protected double balance;
    public BankAccount(String accountNumber,double balance)					//non abstract method
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public abstract void deposit(double amount);							//abstract methods
    public abstract void withdraw(double amount);
}