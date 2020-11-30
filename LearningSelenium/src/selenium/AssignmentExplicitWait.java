package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicitWait {

	public static void main(String[] args) {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,3); //setup wait variable
		
		//go to web-page
		driver.manage().window().maximize();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content"))); //wait for web-page loaded
		
		driver.findElement(By.xpath("//div[@id='content']/a[2]")).click(); //click on hyperlink
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#results"))); //wait for message
		
		//printout message
		System.out.println(driver.findElement(By.cssSelector("#results")).getText());
		
		
	}

}
