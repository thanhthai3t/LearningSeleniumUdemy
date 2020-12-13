package section11_AjaxCallWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// go to page
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
				
		//create multiple windows
		Actions a = new Actions(driver);
		a.keyDown(Keys.SHIFT).click(driver.findElement(By.xpath("//a[text()='Terms']"))).build().perform(); //child window 1
		a.keyDown(Keys.SHIFT).click(driver.findElement(By.xpath("//a[text()='Privacy']"))).build().perform(); //child window 2
		
		//get list of IDs from multiple window
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		Iterator<String> it = ids.iterator();
		
		//declare object for each windows
		String parentid=it.next();
		String childid1= it.next();
		String childid2= it.next();
		System.out.println(driver.getTitle()); //parent title
		System.out.println(parentid);
		
		driver.switchTo().window(childid1); //switch to child window 1
		System.out.println(driver.getTitle());
		System.out.println(childid1);
		
		driver.switchTo().window(childid2); //switch to child window 2
		System.out.println(driver.getTitle());
		System.out.println(childid2);
		
		
	}

}
