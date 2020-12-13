package section10_Synchronization;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncWait {

	public static void main(String[] args) throws InterruptedException {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//set implicit wait 
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait w = new WebDriverWait(driver,5);
		
		
		// set array
		String[] itemList = { "Cucumber", "Brocolli", "Beans", "Carrot" };

		// launch webpage
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.product-action")));
		
		// call method to select item into cart
		selectCart(driver, itemList);
		
		//checkout cart
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("button.promoBtn")))); //wait for apply button appearing
		
		//input invalid promote code
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("test");
		driver.findElement(By.cssSelector("button.promoBtn")).click(); //apply the promote code
		w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo")))); //wait
		
		//printout error message
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		//input valid promote code
		driver.navigate().refresh();
		w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("button.promoBtn")))); //wait for apply button appearing
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click(); //apply the promote code
		w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo")))); //wait for message	
		//printout error message
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

	public static void selectCart(WebDriver driver, String[] itemList) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		// select item
		for (int i = 0; i < products.size(); i++) {

			// split text
			String[] name = products.get(i).getText().split("-");
			// remove spaces
			String formattedName = name[0].trim();

			// convert to arrayList
			List formattedItemList = Arrays.asList(itemList);

			if (formattedItemList.contains(formattedName)) {

				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemList.length) {
					break;
				}
			}
		}
	}
}
