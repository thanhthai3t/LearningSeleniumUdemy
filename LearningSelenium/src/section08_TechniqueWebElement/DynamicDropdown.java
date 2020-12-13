package section08_TechniqueWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.agoda.com/");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@data-selenium='occupancyBox']")).click(); //click on occupant dropdown
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@data-selenium='traveler-families']")).click(); // click on couple option

		//update number of member
		for (int i = 1; i < 4; i++) {

			driver.findElement(By.xpath("//div[@data-selenium='occupancyAdults']/span[@data-selenium='plus']")).click();
		}

		// get the result -number
		System.out.println(driver.findElement(By.xpath("//span[@data-selenium='desktop-occ-adult-value']")).getText());

		// get result number full text
		System.out.println(driver.findElement(By.xpath("//div[@data-selenium='traveler-families']")).getText());
		Thread.sleep(2000);

	}
}
