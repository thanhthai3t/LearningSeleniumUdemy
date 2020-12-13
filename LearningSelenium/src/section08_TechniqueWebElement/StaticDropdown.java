package section08_TechniqueWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		//Object: Handle Static dropdown-list
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/register"); //go to particular site
		
		//set object for select class 
		Select s1 = new Select(driver.findElement(By.cssSelector("#day")));
		Select s2 = new Select(driver.findElement(By.cssSelector("#month")));
		
		driver.findElement(By.cssSelector("#u_0_n")).sendKeys("test");
		
		//s1.selectByIndex(30);
		s1.selectByVisibleText("30"); //choose date 30th
		
		s2.selectByIndex(5); //selected month = n+1 because current month is already populated
	}

}
