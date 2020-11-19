package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningSelenium {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\trant\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); 
	
	//learning how to interact autocomplete dropdown
	
	// open browser
	//driver.manage().window().maximize();
	driver.get("https://www.agoda.com/");
	Thread.sleep(2000);
		
	//run the test
	driver.findElement(By.xpath("//div[@data-selenium='autocomplete-box']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-selenium='textInput']")).sendKeys("ho chi"); //input keyword
	
	
	Thread.sleep(2000);
	
	List<WebElement> options = driver.findElements(By.cssSelector("ul[class='AutocompleteList'] li[data-selenium='autosuggest-item'] span[data-selenium='suggestion-text']"));
	
	for(WebElement option: options)
	{
		if(option.getText().equalsIgnoreCase("Ho Chi Minh City")) 
		{
			option.click();
			break;
		}
	}
	
	
;
}
}
