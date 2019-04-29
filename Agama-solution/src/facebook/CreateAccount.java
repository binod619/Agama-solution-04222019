package facebook;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	ChromeDriver driver;
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binod\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}
	public void createAccount(String firstName, String lastName, String email, String passwd, String month,
			String day, String year, String gender ) {
		driver.findElementByName("firstname").sendKeys(firstName);
		driver.findElementByName("lastname").sendKeys(lastName);
		driver.findElementByName("reg_email__").sendKeys(email);
		driver.findElementByName("reg_email_confirmation__").sendKeys(email);
		driver.findElementByName("reg_passwd__").sendKeys(passwd);
		driver.findElementByName("birthday_month").sendKeys(month);
		driver.findElementByName("birthday_day").sendKeys(day);
		driver.findElementByName("birthday_year").sendKeys(year);
		if (gender=="m") {
			driver.findElementByXPath("//*[@id=\"u_0_a\"]").click();
		} else {
			driver.findElementByXPath("//*[@id=\"u_0_9\"]").click();
		}
	}
	
}
