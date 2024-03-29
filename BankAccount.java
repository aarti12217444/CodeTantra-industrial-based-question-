/*Imagine you are creating a simple banking application, 
and you've designed a Java class named BankAccount to represent 
individual bank accounts. Each account has a private balance, 
and you've implemented getter and setter methods to access and 
update this balance.
In your application, Alice decides to open two bank accounts. 
Alice opens an account with an initial balance of zero and another with
 some amount.
How would you use the BankAccount class to create separate accounts for 
Alice using the getBalance() and setBalance() methods?
Input Format:
The input line reads a double value representing the amount.
Output Format:
The output lines print the default account's initial balance followed
 by the second account's initial balance.
*/

import java.util.Scanner;

class BankAccount{
	private double balance;
	
	public BankAccount(){
		this.balance = 0.0;
	}
	
	public BankAccount(double initialBalance){
		this.balance=initialBalance;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setBalance(double newBalance){
		this.balance=newBalance;
	}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account1 = new BankAccount();
        System.out.println("Default Account - Initial Balance: $" + account1.getBalance());
        double initialBalanceInput = scanner.nextDouble();
        BankAccount account2 = new BankAccount(initialBalanceInput);
        System.out.println("Second Account - Initial Balance: $" + account2.getBalance());
        scanner.close();
    }
}



