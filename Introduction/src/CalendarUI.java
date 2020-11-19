import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {
	public static void main(String[] args) throws InterruptedException {
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//create driver object
		WebDriver driver = new ChromeDriver();
		
		//practice with spicejet handle calendar UI	
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		
		Thread.sleep(5000);
		
		//automate
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // click on From dropdown
		driver.findElement(By.xpath("//a[@value='SXR']")).click();
				
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//a[@value='DED'])[2]")).click(); //click [To] dropdown
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DED']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
	}
}
