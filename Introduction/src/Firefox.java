import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver_v0.27.win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 		
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
