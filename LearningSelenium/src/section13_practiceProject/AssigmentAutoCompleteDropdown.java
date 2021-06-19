package section13_practiceProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class AssigmentAutoCompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// Object: Scrolling and verify 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		
		autocomplete.sendKeys("united");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='United States (USA)']")).click();
		Thread.sleep(2000);
		
		String result = autocomplete.getAttribute("value");
		System.out.println(result);
		
		Assert.assertEquals(result, "United States (USA)");
		
		
	}

}
