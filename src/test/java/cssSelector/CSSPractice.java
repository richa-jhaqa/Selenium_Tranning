package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		// ID using CSS
		driver.findElement(By.cssSelector("#user-name"))
		.sendKeys("standard_user");
		
		 // Attribute using CSS
		driver.findElement(By.className("input[placeholder='Password']"))
		.sendKeys("secret_sauce");
		
		// Tag + ID using CSS
		driver.findElement(By.cssSelector("input#login-button"))
		.click();
		
	}

}
