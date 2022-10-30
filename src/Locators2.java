import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String User = "Rahul";
		System.setProperty("webdriver.chrome.driver", "\\Users\\jayve\\Documents\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "\\Users\\jayve\\Documents\\browserdrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver", "\\Users\\jayve\\Documents\\browserdrivers\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//Locators
		driver.findElement(By.id("inputUsername")).sendKeys(User);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+User+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.quit();
	}

		public static String getPassword(WebDriver driver) throws InterruptedException 
		{
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			Thread.sleep(1000);
			String passwordText = driver.findElement(By.cssSelector("form p")).getText();
			String[] passwordArray = passwordText.split("'");
			String password = passwordArray[1].split("'")[0];
			return password;
			
		}
		
}
