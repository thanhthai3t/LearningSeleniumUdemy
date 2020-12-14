package Section06_ConfigDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com");
		//System.out.println(driver.getTitle());
	}
}
