import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {
	public static void main(String[] args) {
		
		//set property
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
				
				//create driver object
				WebDriver driver = new ChromeDriver();
				
				//practice facebook page
				//driver.get("https://facebook.com/");
				
				//using Xpath
				/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("enterusername");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
				driver.findElement(By.xpath("//button[@type='submit']")).click();*/
				
				//using CSS
				/*driver.findElement(By.cssSelector("input[name='email']")).sendKeys("usingcss");
				driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("111111");
				driver.findElement(By.cssSelector("button[type='submit']")).click();*/
				
				//practice on rediff
				driver.get("https://www.rediff.com");
				
				driver.findElement(By.xpath("//a[@title='Already a user']")).click();
				driver.findElement(By.cssSelector("#login1")).sendKeys("helloworld");
				driver.findElement(By.cssSelector("[name='passwd']")).sendKeys("123123");
				driver.findElement(By.xpath("//input[contain(@name,'procee']")).click();
	}
}
