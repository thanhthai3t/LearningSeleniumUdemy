package Section07_LocateObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	public static void main(String[] args) throws InterruptedException {
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//practice with spicejet doing dynamic dropdownlist
		driver.manage().window().maximize();
		
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(10000);
				
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // click on From dropdown
		driver.findElement(By.xpath("//a[@value='SXR']")).click();	
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//a[@value='DED'])[2]")).click(); //click [To] dropdown => hardcode appoarch
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DED']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getText());

		
		//driver.close();

		
	}
}
