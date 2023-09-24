package Task;

import java.util.Scanner;

class BankAccount{
	
	private double balance;

	public BankAccount(double d) {
		// TODO Auto-generated constructor stub
		this.balance = d;
	}

	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void deposit(double depositAmount) {
		// TODO Auto-generated method stub
		
		if(depositAmount > 0) {
			balance = balance+depositAmount;
			System.out.println("Deposit successfully. Total banlance: ₹"+balance);
		}
		else {
			System.out.println("Invalid amount.");
		}
		
	}

	public boolean withdraw(double withdrawalAmount) {
		// TODO Auto-generated method stub
		if(withdrawalAmount>0 && withdrawalAmount <= balance) {
			balance = balance-withdrawalAmount;
			System.out.println("Withdrawal successful. New balance: ₹" + balance);
			return true;
		}
		else {
			System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
		}
	}
	
}

public class ATM {
	
	private BankAccount bankAccount;

	public ATM(BankAccount bankAccount) {
		
		this.bankAccount = bankAccount;
	}
	
	public void displayMenu() {
		
		System.out.println("Welcome to the ATM Page Select correct Option!");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exits");
	}
	
	
	
	public static void main(String args[]) {
		
		BankAccount user = new BankAccount(2000.0);
		ATM atm = new ATM(user);
		atm.chooseOption();
	}



	private boolean chooseOption() {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			displayMenu();
			System.out.println("Choose Option:");
			int choice = scanner.nextInt();
			
			
			switch (choice) {
			case 1:
				System.out.println("Current Balance: ₹" + bankAccount.getBalance());
				break;
				
			case 2:
				System.out.println("Enter deposit amount : ₹");
				double depositAmount = scanner.nextDouble();
				bankAccount.deposit(depositAmount);
				break;
				
			case 3:
				System.out.println("Enter withdrawal amount : ₹");
				double withdrawalAmount = scanner.nextDouble();
				bankAccount.withdraw(withdrawalAmount);
				break;
			
			case 4:
				System.out.println("Thank you for using ATM");
				return false;
				
			default:
				System.out.println("Invalid choice. Please try again");
			}
		}
		
	}
	
	
}
