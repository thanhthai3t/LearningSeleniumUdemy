package section08_TechniqueWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateElementStatus {

	public static void main(String[] args) throws InterruptedException {
		//object: learning how to validate disabled / enabled status in an element

		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//open URL in browser
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
				
		driver.findElement(By.id("Div1")).click(); 	//click on date picker
		
		//check if date picker is able to click
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Validate completed: Disabled");
			Assert.assertTrue(true);

		} 
		
		/*else if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {			
			System.out.println("Validate completed: Enabled");
			Assert.assertFalse(false);
		}*/
		
		else {
			System.out.println("Validate completed: Enabled");
			Assert.assertFalse(false);
		}

	}

}
