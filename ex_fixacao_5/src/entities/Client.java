package entities;

public class Client {
	private static int accountNumber;
	private String accountName;
	private double accountValue;
	private static double TAX = 5.0;
	
	public Client(int accountNumber, String accountName, double initialDeposit) {
		super();
		Client.setAccountNumber(accountNumber);
		this.accountName = accountName;
		deposit(initialDeposit);
	}
	
	public Client(int accountNumber, String accountName) {
		super();
		Client.setAccountNumber(accountNumber);
		this.accountName = accountName;
	}
	
	public static int getAccountNumber() {
		return accountNumber;
	}

	public static void setAccountNumber(int accountNumber) {
		Client.accountNumber = accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public double getAccountValue() {
		return accountValue;
	}
	
	public void deposit(double value) {
		accountValue += value;
	}
	
	public void withdraw(double value) {
		accountValue -= value + TAX;
	}
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + accountName + ", Balance: " + accountValue;
	}
	
}
