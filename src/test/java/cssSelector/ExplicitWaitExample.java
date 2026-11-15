package cssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.saucedemo.com/");
			
			WebDriverWait wait =
					new WebDriverWait(driver,Duration.ofSeconds(10));
			
			WebElement username = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.id("user-name")
							)
					);
			
			username.sendKeys("standard-user");
			 System.out.println("Username entered successfully");

		}finally {
			driver.quit();
		}
	}

}
