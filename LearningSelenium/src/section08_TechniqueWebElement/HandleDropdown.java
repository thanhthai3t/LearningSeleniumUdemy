package section08_TechniqueWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		//Object: practice with spicejet doing dynamic drop down-list
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // click on From dropdown-list
		driver.findElement(By.xpath("//a[@value='SXR']")).click();
		Thread.sleep(1000);
				
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DED']")).click(); // click on To dropdown-list
				
	}

}
