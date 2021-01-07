package Section12_E2EPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountElement {

	public static void main(String[] args) {
		// OBJECT: Count li
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1.count number of link on page
		System.out.println(driver.findElements(By.tagName("a")).size()); //get number of link entire page
		
		//2.count number of link on footer page
		WebElement footerPage = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footerPage.findElements(By.tagName("a")).size());
		
		//3. count number of subset section in footer
		WebElement subsetColumnFooter = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println("Number of links are: "+subsetColumnFooter.findElements(By.tagName("a")).size());
		
		//4. check each link still works correctly
		for(int i=1; i < subsetColumnFooter.findElements(By.tagName("a")).size();i++ )
		{
			String clickonlinkKey=Keys.chord(Keys.CONTROL,Keys.ENTER); //open link on new tab
			
			subsetColumnFooter.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkKey);

		}
		
	}

}
