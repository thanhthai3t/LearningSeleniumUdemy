package section10_Synchronization;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitTest {
	public static void main(String[] args) {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to page
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//click on start
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		//setup fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("div[id='finish'] h4"));
				}
				else 
				{
					return null;
				}
			}
			
		});
		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
	}

}
