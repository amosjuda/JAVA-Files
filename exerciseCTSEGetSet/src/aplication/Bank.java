package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int permission = 0;
		char yorn;
		Account account = null;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		while(permission == 0) {
			System.out.print("Is there na initial deposit (y/n)? ");
			yorn = sc.nextLine().charAt(0);
			
			if(yorn == 'y') {
				System.out.print("Enter initial deposit value : ");
				double initialDeposit = sc.nextDouble();
				account = new Account(number, holder, initialDeposit);
				permission++;
			} else if(yorn == 'n') {
				account = new Account(number, holder);
				permission++;
			} else {
				System.out.println("Please write 'y' or 'n'");
			}
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter A withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}
}
