package flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	ChromeDriver driver;
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binod\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
	}
	public void login(String userId, String password) {
		//driver.findElementByXPath("//div[@class=\"_3Njdz7\"]//input[@type=\"text\"]").sendKeys(userId);
		//driver.findElementByXPath("//div[@class=\"_3Njdz7\"]//input[@type=\"password\"]").sendKeys(password);
		//driver.findElementByXPath("//div[@class=\"_3Njdz7\"]//button[@type=\"submit\"]").click();
		driver.findElementByXPath("//div[@class=\"_3Njdz7\"]//button[@class='_2AkmmA _29YdH8']").click();
		driver.findElementByXPath("//input[@title='Search for products, brands and more']").sendKeys("apple watch");
		driver.findElementByXPath("//button[@class='vh79eN']").click();

	}

}
