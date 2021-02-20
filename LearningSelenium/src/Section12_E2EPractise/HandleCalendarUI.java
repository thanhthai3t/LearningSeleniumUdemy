package Section12_E2EPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarUI {

	public static void main(String[] args) throws InterruptedException {
		// OBJECT: Handle calendar pickup
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver88.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.id("travel_date")).click(); // click on date field

		//select a particular month
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("May"));
		{
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
		}
		
		
		//select a particular date in calendar pickup
		int count = driver.findElements(By.className("day")).size();

		for (int i = 0; i < count; i++)  
		{

			String date = driver.findElements(By.className("day")).get(i).getText();
			if (date.equalsIgnoreCase("15")) //input date
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}

	}

}
