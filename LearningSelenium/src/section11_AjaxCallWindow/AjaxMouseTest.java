package section11_AjaxCallWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjaxMouseTest {

	public static void main(String[] args) throws InterruptedException {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// go to page
		driver.get("https://amazon.com");
		
		//declare action object
		Actions a = new Actions(driver);
		//declare move object
		WebElement move1 = driver.findElement(By.cssSelector("#nav-link-accountList")); //account field
		WebElement move2 = driver.findElement(By.cssSelector("div.nav-search-field")); //search field
		
		//input search field using upper-case text
		a.click(move2).keyDown(Keys.SHIFT).sendKeys("testing").build().perform();
		a.click(move2).doubleClick();
		
		//move mouse over
		a.moveToElement(move1).build().perform();
		a.moveToElement(move1).contextClick().build().perform(); //right click;
	}

}
