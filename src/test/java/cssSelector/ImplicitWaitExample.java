package cssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		
		username.sendKeys("standard_user");
		
		 System.out.println("Username entered successfully");
		 
		 driver.quit();
	}

}
