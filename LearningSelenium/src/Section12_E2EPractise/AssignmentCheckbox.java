package Section12_E2EPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCheckbox {

	public static void main(String[] args) {
		// OBJECT: Assigment click on checkbox
				// set property
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
				
				//task 1: click on any checkbox
				driver.findElement(By.cssSelector("#checkBoxOption3")).click(); //click on checkbox
				
				//task 2: copy text label
				String labelCheckbox = driver.findElement(By.xpath("//label[@for='honda']")).getText();		
				
				//task 3: select relevant option from copied text 
				Select s = new Select(driver.findElement(By.cssSelector("#dropdown-class-example")));
				s.selectByVisibleText(labelCheckbox);
				
				//task 4: input text 
				driver.findElement(By.cssSelector("#name")).sendKeys(labelCheckbox);
				driver.findElement(By.cssSelector("#alertbtn")).click();
				
				//task 5: verify copied text is available
				String alertText = driver.switchTo().alert().getText();
				if (alertText.contains(labelCheckbox))
				{
					System.out.println("Checkbox's label is available in the alert message!");
				}
				else 
				{
				System.out.println("Checkbox's label is missing");	
				}
		
		

	}

}
