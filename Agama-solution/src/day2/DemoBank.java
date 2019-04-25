package day2;

public class DemoBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount binod = new BankAccount(056400001, 100000, "Binod Tiwari", "binod619@gmail.com", "5103337403");
		
		binod.deposite(15000);
		binod.withdraw(110000);

	}

}
