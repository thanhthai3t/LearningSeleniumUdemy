package section11_AjaxCallWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrame {

	public static void main(String[] args) throws InterruptedException {
		// Objective: Handle frame
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// go to page
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		Thread.sleep(2000);
		
		//switch to a particular frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frameset[frameborder='1'] frame[name='frame-top']")));
		//switch to middle frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		//get text
		System.out.println(driver.findElement(By.cssSelector("#content")).getText() );
	}

}
