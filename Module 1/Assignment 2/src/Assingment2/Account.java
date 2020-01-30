package Assingment2;

public class Account {

	private int id = 0;
	
	private double balance;
	
	private double annualInterestRate = 4.5;
	
	// set balance to zero
	public Account() {
		balance = 20000.0;
	}
	
	// deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	//withdraw
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	//get balance
	public double getBalance() {
		return balance;
	}
	
	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	//returns the preset interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
		
	//converts interest rate to a percent and divides it by 12 to find the monthly rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	
	//multiplies the monthly rate by the balance to determine the amount of interest
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
}
