package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Pension;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantRoons = 10;
		Pension[] pension = new Pension[quantRoons];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Client[] clients = new Client[n];
		
		for (int i = 0; i < clients.length; i++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			clients[i] = new Client(name, email);
			pension[room] = new Pension(clients[i]);
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < pension.length; i++) {
			if (pension[i] != null) {
				System.out.println(i + ": " + pension[i].getClient());		
			}
		}
		
		sc.close();
	}

}
