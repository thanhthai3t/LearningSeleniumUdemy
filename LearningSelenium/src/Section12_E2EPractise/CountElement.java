package Section12_E2EPractise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountElement {

	public static void main(String[] args) throws InterruptedException {
		// OBJECT: Count links
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1.count number of link on page
		System.out.println("Number of links in the page: " +driver.findElements(By.tagName("a")).size()); //get number of link entire page
		
		//2.count number of link on footer page
		WebElement footerPage = driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println("Number of links in the footer of the page: " +footerPage.findElements(By.tagName("a")).size());
		
		//3. count number of subset section in footer
		WebElement subsetColumnFooter = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println("Number of subset links are: "+(subsetColumnFooter.findElements(By.tagName("a")).size()-1)); // the first one is the title
		
		//4. check each link still works correctly
		for(int i=1; i < subsetColumnFooter.findElements(By.tagName("a")).size();i++ )
		{
			String clickonlinkKey=Keys.chord(Keys.CONTROL,Keys.ENTER); //open link on new tab
			
			subsetColumnFooter.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkKey);
			Thread.sleep(2000);

		}
		 
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> it = ids.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println("Window Title = "+ driver.getTitle());
			Thread.sleep(2000);
			
		}
		
	}

}
