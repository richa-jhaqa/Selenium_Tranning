package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://example.com");
		
		driver.findElement(By.cssSelector("#email"))
		.sendKeys("test@gmail.com");
		
		driver.findElement(By.cssSelector("#password"))
		.sendKeys("Test@123");
		
		driver.findElement(By.cssSelector(".login-btn"))
		.click();
	}

}
