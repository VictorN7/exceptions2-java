package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		
		try {
			
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			Integer number = scan.nextInt();
			
			
			System.out.print("Holder: ");
			scan.next();
			String holder = scan.nextLine();
			
			System.out.print("Inital balance: ");
			double balance = scan.nextDouble();
					
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = scan.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = scan.nextDouble();
			
			account.withdraw(withdraw);
			
			
		} catch (DomainException e) {

			System.out.println("Withdraw error: "+ e.getMessage());
		}
		catch (RuntimeException e) {

			System.out.println("Unexpected error");
		
		}
	
		scan.close();
		
	}

}
