package Section12_E2EPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarUIPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.agoda.com/");
		Thread.sleep(10000);
		driver.navigate().refresh(); //refresh page to ignore ads pop-up
		
		driver.findElement(By.cssSelector("li[data-selenium='agodaFlightsTab']")).click(); //choose flight method
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div[data-selenium='date-selector-title']")).click(); //click on date field
		
		Thread.sleep(2000);
		//select a particular month

		while(!driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Caption']/div")).getText().contains("May"))
		{
			driver.findElement(By.cssSelector("span[data-selenium='calendar-next-month-button']")).click();
			
		}
		
		//select a particular date
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[@class='DayPicker-Body']/div/div/span"));
		int count = dates.size();
		
		for(int i=0;i<count;i++)
		{
			
			String date = dates.get(i).getText();
			if(date.equalsIgnoreCase("25"))
			{
				dates.get(i).click();
				break;
			}
		}
				
	}

}
