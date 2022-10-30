import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class angularpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "\\Users\\jayve\\Documents\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/angularpractice/"); // URL in the browser
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), 'Name')]/following-sibling::input")).sendKeys("John");
		driver.findElement(By.xpath("//label[contains(text(), 'Email')]/following-sibling::input"))
				.sendKeys("John@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(), 'Password')]/following-sibling::input"))
				.sendKeys("John13232");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();

		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Female");

		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12051997");

		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText().contains("Success! The Form has been submitted successfully!."));

		/*
		 * Rahul codes
		 * 
		 * driver.findElement(By.name("name")).sendKeys("rahul");
		 * 
		 * driver.findElement(By.name("email")).sendKeys("hello@abc.com");
		 * 
		 * driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		 * 
		 * driver.findElement(By.id("exampleCheck1")).click();
		 * 
		 * WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		 * 
		 * Select abc = new Select(dropdown);
		 * 
		 * abc.selectByVisibleText("Female");
		 * 
		 * driver.findElement(By.id("inlineRadio1")).click();
		 * 
		 * driver.findElement(By.name("bday")).sendKeys("02/02/1992");
		 * 
		 * driver.findElement(By.cssSelector(".btn-success")).click();
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(".alert-success")).
		 * getText());
		 */
	}
}
