package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		double percentage;
		
		System.out.println("Enter employee data: ");
		employee.Name = sc.nextLine();
		employee.GrossSalary = sc.nextDouble();
		employee.Tax = sc.nextDouble();
		
		System.out.println("Name: " + employee.Name);
		System.out.println("Gross Salary: " + employee.GrossSalary);
		System.out.println("Tax: " + employee.Tax);
		
		System.out.println("Employee: " + employee.Name + ", " + employee.NetSalary());
		
		System.out.println("Which percentage to increase salary?");
		percentage = sc.nextDouble();
		employee.IcreaseSalary(percentage);
		
		System.out.println("Updated data: " + employee.Name + ", " + employee.NetSalary());

		sc.close();
	}
	
}
