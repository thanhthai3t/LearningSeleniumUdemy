package section11_AjaxCallWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to test page
		driver.get("https://jqueryui.com/droppable/");
		
		//select iframe
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//drag and drop element
		Actions a = new Actions(driver);
		//declare object for source and target
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();
		
		//back to default frame
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='sidebar']/aside[1]/ul/li[1]")).click();
	}

}
