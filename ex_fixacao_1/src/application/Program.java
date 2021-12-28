package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println("AREA  = " + retangulo.Area());
		System.out.println("PERIMETER  = " + retangulo.Perimeter());
		System.out.println("DIAGONAL  = " + retangulo.Diagonal());
		
		sc.close();

	}

}
