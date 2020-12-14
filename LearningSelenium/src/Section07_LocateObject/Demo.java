package Section07_LocateObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
		
		//set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https:/google.com");
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getCurrentUrl());
		
		//get page source
		
		//System.out.println(driver.getPageSource());
		
		driver.get("https://facebook.com/");
		//driver.close();
		
		/*driver.findElement(By.id("email")).sendKeys("send keys"); //input email into email field
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten password?")).click();*/
		
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("inputemail"); //input username
		driver.findElement(By.cssSelector("#pass")).sendKeys("123456"); //input password
		driver.findElement(By.xpath("//*[@id=\'u_0_a\']/div[3]/a")).click(); //click on forgot password
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("did_submit")).click(); // click on search button
		
		
	}
}
