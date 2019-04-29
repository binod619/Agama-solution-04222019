package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	ChromeDriver driver;
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\binod\\eclipse-workspace\\libs\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
	}
	public void searchItem( String itemNum) {
		WebElement dropdown = driver.findElement(By.name("url"));
		Select url= new Select(dropdown);
		url.selectByVisibleText("Electronics");
		String searchKey="apple watch";
		driver.findElementById("twotabsearchtextbox").sendKeys(searchKey);
		driver.findElementByXPath("//input[@value='Go']").click();
		String responce= driver.findElementByXPath("//*[@id=\"search\"]/span/h1/div/div[1]/div/div/span[1]").getText();
		System.out.println("The value of responce :: "+ responce);
		driver.findElementByXPath("//input[@value='Go']").click();
		String itemNumXpath= String.format("//div[@class='s-result-list sg-row']//div[@data-index='%s']", itemNum);
		System.out.println(driver.findElementByXPath(itemNumXpath).getText());
		
	}

}
