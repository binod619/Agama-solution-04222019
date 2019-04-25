package day2;


public class BankAccount {

	private int accountNumber;
	private int balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber)
	{
		this.accountNumber= accountNumber;
		this.balance= balance;
		this.customerName=customerName;
		this.email=email;
		this.phoneNumber=phoneNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void deposite(int deposite)
	{
		if (deposite>0) 
		{
			balance=balance +deposite;
			System.out.println("your new balance is ::" + balance);
			}
		else { System.out.println("invalid amount");}
	}
	
	public void withdraw (int withdraw)
	{
		if (withdraw < balance)
				{
				balance= balance - withdraw;
				System.out.println("your new balance is ::" + balance);
				}
		else { System.out.println("dont have enough fund");}
	}
}
