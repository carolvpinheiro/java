package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;

public class Program {

//	private static char y;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Client client;
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		System.out.println("Is there na initial deposit (y/n)?");
		char yesOrNo = sc.next().charAt(0);
		
		if(yesOrNo == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			client = new Client(account, name, initialDeposit);
				
			} else {
				client = new Client(account, name);
			}
		System.out.println("Account data:");
		System.out.println(client);
		
		System.out.println("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		client.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(client);
		
		System.out.println("Enter deposit value: ");
		double withdrawValue = sc.nextDouble();
		client.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(client);
		
		sc.close();
	}

}
