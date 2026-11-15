package cssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
			
			WebDriverWait wait =
					new WebDriverWait(driver,Duration.ofSeconds(15));
			
			WebElement startButton = wait.until(
					ExpectedConditions.elementToBeClickable(By.cssSelector("#start button")	));
			startButton.click();	
			
			 WebElement message = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(
		                    By.cssSelector("#finish h4")
		                )
		            );
			 System.out.println("Message: " + message.getText());

	            System.out.println("Test Passed!");

		}finally {
			driver.quit();
		}
	}
	

}
