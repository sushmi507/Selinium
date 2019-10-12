package AcmeTestCase;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase_001{

	@Test
	public void acme() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//to launch a chrome.....
		
		ChromeDriver driver = new ChromeDriver();
		//to load the URL
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		//to maximize the browser
		driver.manage().window().maximize();
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
		Actions builder =new Actions(driver);
		
		WebElement dropdown1 = driver.findElementByXPath("//button[text()=' Vendors']");
				builder.moveToElement(dropdown1).click().perform();
				
				WebElement dropdown2 = driver.findElementByLinkText("Search for Vendor");
				builder.moveToElement(dropdown2).click().perform();
		driver.findElementById("vendorName").sendKeys("Blue lagoon");
		driver.findElementById("buttonSearch").click();
		String s = driver.findElementByXPath("//td[text()='France']").getText();
		System.out.println(s);
		driver.findElementByLinkText("Log Out").click();
	}
	

}
