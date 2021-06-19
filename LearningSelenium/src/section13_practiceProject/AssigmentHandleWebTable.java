package section13_practiceProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssigmentHandleWebTable {

	public static void main(String[] args) throws InterruptedException {
		// handle table
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scroll(0,500)"); Thread.sleep(2000);
		  
		  List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		  System.out.println("Number of row = "+ rows.size());
		  
		  List<WebElement> columns = driver.findElements(By.cssSelector(".table-display th"));
		  System.out.println("Number of columns = "+ columns.size());
		  
		  List<WebElement> specificRows = driver.findElements(By.cssSelector(".table-display tr")).get(2).findElements(By.tagName("td"));
		  
		  System.out.println("Instructor: "+ specificRows.get(0).getText());
		  System.out.println("Course : "+ specificRows.get(1).getText());
		  System.out.println("Price: "+ specificRows.get(2).getText());
		  
	}		 
	  

			/*
			 * WebElement table=driver.findElement(By.id("product"));
			 * 
			 * System.out.println(table.findElements(By.tagName("tr")).size());
			 * 
			 * System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(
			 * By.tagName("th")).size());
			 * 
			 * List<WebElement>
			 * secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName
			 * ("td"));
			 * 
			 * System.out.println(secondrow.get(0).getText());
			 * 
			 * System.out.println(secondrow.get(1).getText());
			 * 
			 * System.out.println(secondrow.get(2).getText());
			 */
		//driver.quit()
}
