import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// set property
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open browser
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);

		// dropdown - select FROM and TO
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); // Select FROM
		driver.findElement(By.xpath("//a[@value='SXR']")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DED']"))
				.click(); // select TO
		Thread.sleep(1000);

		// click on current date on date picker
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		// click on date picker disabled or enabled
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("Validate completed: Disabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Validate completed: Enabled");
			Assert.assertFalse(false);
		}

		// Select Passenger dropdown
		driver.findElement(By.id("divpaxinfo")).click();
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByValue("5");

		// Select currency dropdown
		Select s2 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s2.selectByValue("USD");

		// select a checkbox
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click(); // click on checkbox

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// count number of checkboxes

		System.out.println(
				"Number of checkboxes are: " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		// click on search
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

	}

}
