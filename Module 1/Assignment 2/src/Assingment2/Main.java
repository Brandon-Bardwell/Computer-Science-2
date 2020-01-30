package Assingment2;


public class Main {

	public static void main(String[] args) {
	
	//create account	
	Account customer1 = new Account();
	
	
	System.out.println("Your starting balance was: " + customer1.getBalance());	
	
	
	customer1.deposit(3000);
	customer1.withdraw(2500);	
	
	
	
	System.out.println("This is your balance after your transactions: " + customer1.getBalance());
	System.out.println("Your monthly interest is: " + customer1.getMonthlyInterest());
	System.out.println("Your annual interest rate is: " + customer1.getAnnualInterestRate() + "%");
	
	

	}

}
