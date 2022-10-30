import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		//Invoking Browser
		//Chrome - ChromeDriver -> Methods
		//chromedriver.exe--> Chrome Browser
		
		// Chrome
		System.setProperty("webdriver.chrome.driver", "\\Users\\jayve\\Documents\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Firefox
		System.setProperty("webdriver.gecko.driver", "\\Users\\jayve\\Documents\\browserdrivers\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		
		// Microsoft Edge
		System.setProperty("webdriver.edge.driver", "\\Users\\jayve\\Documents\\browserdrivers\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
				
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		driver.close();
		//driver.quit();
	}
	
}
