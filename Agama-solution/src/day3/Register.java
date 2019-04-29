package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	ChromeDriver driver;
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binod\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
	}
	public void newRegister(String title, String firstname, String lastname, String phone, String year, String month, 
			String date, String fullTime, String licenceperiod, String occupation, String street, 
			String city, String county, String post_code, String email, String password, String c_password)
	{
		driver.findElementByLinkText("Register").click();
		driver.findElement(By.name("title")).sendKeys(title);
		driver.findElement(By.name("fiestname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(lastname);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("year")).sendKeys(year);
		driver.findElement(By.name("month")).sendKeys(month);
		driver.findElement(By.name("date")).sendKeys(date);
		if (fullTime=="full") {
			driver.findElementById("licencetype_t").click();
		} 
		else { driver.findElementById("licencetype_f").click(); }
		
		driver.findElement(By.name("licenceperiod")).sendKeys(licenceperiod);
		driver.findElement(By.name("occupation")).sendKeys(occupation);
		driver.findElement(By.name("street")).sendKeys(street);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("county")).sendKeys(county);
		driver.findElement(By.name("post_code")).sendKeys(post_code);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("c_password")).sendKeys(c_password);
		driver.findElement(By.name("submit")).click();
		
	}
	

}
