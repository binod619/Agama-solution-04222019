package facebook;

public class DemoFacebook {

	public static void main(String[] args) {
	CreateAccount facebook = new CreateAccount();
	facebook.invokeBrowser();
	facebook.createAccount("Binod", "tiwari", "binod1234@yahoo.com", "biondtiwari", "mar", "29", "1990", "m");
	
	}

}
