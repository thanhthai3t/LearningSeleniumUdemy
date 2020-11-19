package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateDisableEnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\trant\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// learning how to validate disabled / enabled status

		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		//not click on date picker
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//click on date picker
		driver.findElement(By.id("Div1")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("Validate completed: Disabled");
			Assert.assertTrue(true);

		} /*else if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("Validate completed: Enabled");
			Assert.assertFalse(false);
		}*/
		
		else {
			System.out.println("Validate completed: Enabled");
			Assert.assertFalse(false);
		}

	}

}
