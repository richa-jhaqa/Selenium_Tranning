package cssSelector;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.Assert;

public class LoginTest1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// Locate username
		WebElement username =
				 driver.findElement(By.id("user-name"));
		
		// Verify username is displayed
		 Assert.assertTrue(username.isDisplayed());
		 
		 // Enter username
		 username.sendKeys("standard-user");
		 
		 WebElement password =
				 driver.findElement(By.id("password"));
		 
		 password.sendKeys("secret-sauce");
		 
		// Click login
		 driver.findElement(By.id("login-button"));
		 
		 // Verify page URL	
		 String actualURL =	driver.getCurrentUrl();
		 
		
				
				
	}

}
