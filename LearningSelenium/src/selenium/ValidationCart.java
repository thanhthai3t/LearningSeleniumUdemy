package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCart {
	public static void main(String[] args) throws InterruptedException {
		// set property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\trant\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		int j = 0;

		// launch webpage
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(5000);

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));

		// set array
		String[] itemList = { "Cucumber", "Brocolli", "Beans" };


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
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

				if (j==3) {
					break;
				}
			}
		}

		// Thread.sleep(5000);

	}

}
