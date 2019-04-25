package day3;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
	ChromeDriver driver;
	
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binod\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qatechhub.com");
	}
	public void  printTitle()
	{
		System.out.println("Title of the page:: "+ driver.getTitle());
		
	}
	public void closeBrowser() {
		driver.close();
		// driver.quit();
	}
	
	public void navigateCommands() {
		driver.navigate().to("https://faceboo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

}
