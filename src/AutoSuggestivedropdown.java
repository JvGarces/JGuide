import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestivedropdown {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "\\Users\\jayve\\Documents\\browserdrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

			driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser
			
			driver.findElement(By.id("autosuggest")).sendKeys("ind");

			Thread.sleep(3000);

			List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

			for(WebElement option :options)

			{

			if(option.getText().equalsIgnoreCase("India"))

			{

			option.click();

			break;

			}

			}

	}

}


		
