package day3;

public class DemoGuru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guru99Project guru = new Guru99Project();
		guru.invokeBrowser();
		guru.login("mngr191540", "avejava");
		String email= "ss" + System.currentTimeMillis()+ "@abc.com";
		guru.addCustomer("Binod Tiwari", "m", "03291990", "1471 Madrone way", "San Pablo", "CA",  "948066", "5103347603",  email, "binodtiwari");
		String cusId=guru.getId();
		System.out.println("Customer id is ::  "+cusId);
		//guru.addAccount(cusId,"Current","1000"); 
		//guru.invokeFacebook();
		//guru.loginFacebook("binod_2756@yahoo.com", "binodtiwari");

	}

}
