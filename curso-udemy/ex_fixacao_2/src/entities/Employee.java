package entities;

public class Employee {

	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		double netSalary = GrossSalary - Tax;
		return netSalary;
	}

	public void IcreaseSalary(double percentage) {
		GrossSalary = GrossSalary + ((GrossSalary * percentage) /100);
	}
	
}
