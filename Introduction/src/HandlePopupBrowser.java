import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopupBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\trant\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//handle browser's popup
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//input value into text field
		driver.findElement(By.id("name")).sendKeys("Thai Tran");
		//click Alert button
		driver.findElement(By.id("alertbtn")).click();
		
		//close popup
		System.out.println(driver.switchTo().alert().getText()); //get alert message
		driver.switchTo().alert().accept();
		
		
		//input value into text field
		driver.findElement(By.id("name")).sendKeys("Thai 3T");
		//click on confirm button
		driver.findElement(By.id("confirmbtn")).click();
		
		//choose cancel
		System.out.println(driver.switchTo().alert().getText()); //get alert message		
		driver.switchTo().alert().dismiss();
		
	}

}
