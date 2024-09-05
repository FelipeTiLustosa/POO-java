package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program_Account {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		// Consumir a quebra de linha após a entrada do número inteiro
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char depositYesOrNot = sc.next().charAt(0);
		
		Account conta;
		
		if(depositYesOrNot=='y') {
			System.out.print("Enter initial deposit value:");
			 double deposito=sc.nextDouble();
			conta=new Account(number,holder,deposito);
			
		}else {
			conta=new Account(number,holder);
		}
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		sc.close();
	}

}
