package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollarsBought = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(dollarsBought, dollarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
		sc.close();

	}

}
