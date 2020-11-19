import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandleCheckbox {
	public static void main(String[] args) throws InterruptedException {
		//set property
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				//create driver object
				WebDriver driver = new ChromeDriver();
				
				//practice with spicejet selecting checkbox
				//driver.manage().window().maximize();
				
				
				//driver.get("https://www.spicejet.com/");
				
				Thread.sleep(5000);
				//automate
				/*
				System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //validate selected or not
				
				driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); //click on checkbox
				
				System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected()); //validate selected or not
				
				//count number of checkboxes
				
				System.out.println("Number of checkbox is: "+driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				
				//driver.close();
				 */
				
				/*
				driver.get("https://www.agoda.com/");
				Thread.sleep(3000);
				//select checkbox combine assert to validate
				driver.findElement(By.cssSelector("span[data-element-name='show-package-deals-check-box']")).click();
				
				
				//validate checkbox
				Assert.assertTrue(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());
			
				
				driver.findElement(By.xpath("//div[@data-selenium='occupancyBox']")).click(); //click on occupant dropdown
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@data-selenium='traveler-families']")).click(); //click on family option
				
				
				for (int i=1;i<4;i++) {
					
					driver.findElement(By.xpath("//div[@data-selenium='occupancyAdults']/span[@data-selenium='plus']")).click();
				}
				
				
				//get the result -number 
				//System.out.println(driver.findElement(By.xpath("//span[@data-selenium='desktop-occ-adult-value']")).getText());
				
				Assert.assertEquals(driver.findElement(By.xpath("//span[@data-selenium='desktop-occ-adult-value']")).getText(), "5");
			
				//get result number full text
				//System.out.println(driver.findElement(By.xpath("//div[@data-selenium='traveler-families']")).getText());
				
				Assert.assertEquals(driver.findElement(By.xpath("//div[@data-selenium='traveler-families']")).getText(), "Family travelers 1 room, 5 adults");
				
				
				Thread.sleep(2000);
				*/
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				//select and validate checkbox
				driver.findElement(By.cssSelector("#checkBoxOption1")).click();
				System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
				
				//unselect and validate checkbox
				driver.findElement(By.cssSelector("#checkBoxOption1")).click();
				System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
				
				//count number of checkboxes
				System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
	}
}
