package day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Project {
	ChromeDriver driver;
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binod\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4/");
	}
	public void login(String userId, String password) {
		WebElement uId; 
		uId= driver.findElement(By.name("uid"));
		uId.sendKeys(userId);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	public void addCustomer(cname,dob,addr) {
	driver.findElement(By.linkText("New customer")).clear();
	driver.findElement(By.name("name")).sendKeys(cname);
	driver.findElement(By.name("dob")).sendKeys(dob);
	driver.findElement(By.name("addr")).sendKeys(addr);
	
	
	}
	
	
	public void invokeFacebook() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binod\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
	}
	public void loginFacebook(String userId, String password) {
		WebElement uId; 
		uId= driver.findElement(By.name("email"));
		uId.sendKeys(userId);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
	}
	}
