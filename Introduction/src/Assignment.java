import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// turn off notification
		ChromeOptions chromeOption = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		// 1-Allow, 2-Block, 0-default
		chromeOption.setExperimentalOption("prefs", prefs);

		// set browser's driver property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\trant\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOption);

		// go to site
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(1000);

		// input FROM field
		driver.findElement(By.id("FromTag")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("FromTag")).sendKeys("new");

		// Select current date
		driver.findElement(By.cssSelector("input[data-on-select='fromHandler']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// Declare object for number of adult /child / Infants
		Select sAdult = new Select(driver.findElement(By.id("Adults")));
		Select sChildren = new Select(driver.findElement(By.id("Childrens")));
		Select sInfant = new Select(driver.findElement(By.id("Infants")));

		// select a value for number of adult /child / Infants
		sAdult.selectByValue("4");
		sChildren.selectByIndex(2);
		sInfant.selectByVisibleText("1");

		// click on More hyperlink
		driver.findElement(By.id("MoreOptionsLink")).click();

		// select class of travel
		Select sClass = new Select(driver.findElement(By.id("Class")));
		sClass.selectByValue("Premium Economy");

		// Input prefer Airline
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");

		// Leave check-box selected
		driver.findElement(By.id("creditShell")).click();

		// Click on Search
		driver.findElement(By.id("SearchBtn")).click();

		// print out error message
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
