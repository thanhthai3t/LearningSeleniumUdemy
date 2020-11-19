import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		//set property
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				//create driver object
				WebDriver driver = new ChromeDriver();
				
				/*
				driver.get("https://www.facebook.com/register");
				
				
				//This is for native dropdown list
				//set object for select class 
				Select s1 = new Select(driver.findElement(By.cssSelector("#day")));
				Select s2 = new Select(driver.findElement(By.cssSelector("#month")));
				
				
				driver.findElement(By.cssSelector("#u_0_n")).sendKeys("test");
				
				//s1.selectByIndex(30);
				s1.selectByVisibleText("30");
				*/
				driver.get("https://www.agoda.com/");
				
				Thread.sleep(1000);
			
				
				driver.findElement(By.xpath("//div[@data-selenium='occupancyBox']")).click();
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//div[@data-selenium='traveler-families']")).click(); //click on couple option
				
				
				for (int i=1;i<4;i++) {
					
					driver.findElement(By.xpath("//div[@data-selenium='occupancyAdults']/span[@data-selenium='plus']")).click();
				}
				
				
				//get the result -number 
				System.out.println(driver.findElement(By.xpath("//span[@data-selenium='desktop-occ-adult-value']")).getText());
			
				//get result number full text
				System.out.println(driver.findElement(By.xpath("//div[@data-selenium='traveler-families']")).getText());
				
				
				Thread.sleep(2000);
				
				//driver.close();
				
				
				
				
	}
}
