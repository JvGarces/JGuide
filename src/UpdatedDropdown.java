import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdown {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "\\Users\\jayve\\Documents\\browserdrivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(2);
		
//			int i = 1;
//			while(i< 5)
//			{
//				driver.findElement(By.id("hrefIncAdt")).click();
//				i++;
//			}
			
			for (int i=1;  i<5; i++)
			{
	
				driver.findElement(By.id("hrefIncAdt")).click();
			}
				driver.findElement(By.id("btnclosepaxoption")).click();
				Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
				System.out.println(driver.findElement(By.id("divpaxinfo")).getText());			
		}
	}

