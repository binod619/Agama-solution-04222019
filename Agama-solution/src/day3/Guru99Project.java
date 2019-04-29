package day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

	public void addCustomer(String customerName, String gender, String dob, String addr, String city, String state, String zip, String mobile, String email, String password) {
	driver.findElement(By.linkText("New Customer")).click();
	driver.findElement(By.name("name")).sendKeys(customerName);
	
	/*if (gender=="male") {
		driver.findElementByXPath("//input[@value='m']").click();
	}
	else {
		driver.findElementByXPath("//input[@value='f']").click();
	} */
	String genderXpath= String.format("//input[@value='%s']", gender);
	driver.findElementByXPath(genderXpath).click();
	driver.findElement(By.name("dob")).sendKeys(dob);
	driver.findElement(By.name("addr")).sendKeys(addr);
	driver.findElement(By.name("city")).sendKeys(city);
	driver.findElement(By.name("state")).sendKeys(state);
	driver.findElement(By.name("pinno")).sendKeys(zip);
	driver.findElement(By.name("telephoneno")).sendKeys(mobile);
	driver.findElement(By.name("emailid")).sendKeys(email);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.name("sub")).click();
	//String customerId=driver.findElementByXPath("//table[@id='customer']/tbody/tr[4]/td[2]").getText();
	//System.out.println("Customer id is ::  "+customerId);
	
	}
	public String getId() {
		return driver.findElementByXPath("//td[text()=\"Customer ID\"]//following-sibling::td").getText();
	}
	
	public void addAccount( String cusId, String aType, String deposit) {
		driver.findElement(By.linkText("New Account")).click();
		driver.findElement(By.name("cusid")).sendKeys(cusId);
		WebElement dropdown = driver.findElement(By.name("selaccount"));
		Select selaccount = new Select(dropdown);
		selaccount.selectByVisibleText(aType);
		driver.findElement(By.name("inideposit")).sendKeys(deposit);
		driver.findElement(By.name("button2")).click();
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
