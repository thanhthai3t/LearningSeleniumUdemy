package section11_AjaxCallWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to test page
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		driver.findElement(By.cssSelector("div[class='example'] a")).click(); //click to open new tab
		
		//get list of IDs from multiple windows
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		
		String window1= it.next();
		String window2= it.next();
		
		driver.switchTo().window(window2); //switch to window 2
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText()); //print out text inside
		
		driver.switchTo().window(window1); //switch to window 1		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText()); //print out text inside
		
		
	}

}
