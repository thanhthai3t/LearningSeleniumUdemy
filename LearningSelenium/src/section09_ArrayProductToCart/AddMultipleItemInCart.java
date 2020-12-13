package section09_ArrayProductToCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddMultipleItemInCart {
	public static void main(String[] args) throws InterruptedException {
		// object: select multiple items and add into cart

		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		int j = 0;

		// launch web-page
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(5000);

		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']")); //find all items on the page

		// set list of item needs to add to cart
		String[] itemList = { "Cucumber", "Brocolli", "Beans", "Carrot" }; // create array

		// select item
		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-"); // split text
			String formattedName = name[0].trim(); // remove spaces

			// convert from array to arrayList
			List formattedItemList = Arrays.asList(itemList);
			//check if item contains keyword 
			if (formattedItemList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				//check maxium of item are selected
				if (j == itemList.length) {
					break;
				}
			}
		}

	}

}
