package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInputField {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		WebElement usernameField = driver.findElement(By.id("username"));
		
		String  currentValue = usernameField.getAttribute("value");
		
		System.out.println("Current value:" + currentValue);
		
		usernameField.clear();
		
		usernameField.sendKeys("Richa123");
		
			

	}

}
