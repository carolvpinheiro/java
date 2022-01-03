package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employees> employees = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(employees, id)) {
				System.out.print("Invalid id, try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			employees.add(new Employees(id, name, salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idWithSalaryIncriase = sc.nextInt();
		Employees employee = employees.stream()
				.filter(i -> i.getId() == idWithSalaryIncriase).findFirst().orElse(null);
		
		if (employee == null) {
			System.out.print("Invalid id");
		} else {
			System.out.println("Enter the percentage: ");
			double incriasePercentage = sc.nextDouble();
			employee.icriaseSalary(incriasePercentage);
		}
		
		System.out.println("List of employees:");
		for (Employees employ : employees) {
			System.out.println(employ.toString());
		}
		
		sc.close();
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees result = list.stream().filter(i -> i.getId() == id).findFirst().orElse(null);
		return result != null;
	}

}
