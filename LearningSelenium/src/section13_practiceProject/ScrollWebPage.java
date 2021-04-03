package section13_practiceProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWebPage {

	public static void main(String[] args) throws InterruptedException {
		// Object: Scrolling and verify 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver88.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//using JS to apply scroll
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//execute scroll
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		
		//scroll down the table inside
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=1000");
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int sum = 0;
		
		for(int i =0; i < values.size(); i++)
		{
			//System.out.println(values.get(i).getText()); //check numbers (string format) are populated
			
			//calculate sum value
			System.out.println(sum = sum + Integer.parseInt(values.get(i).getText()));
		}

		System.out.println("Sum number is: "+sum);
	}

}
