package cssSelector;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@name='q']"));
		
		searchbox.sendKeys("Selenium Webdriver");
		
		searchbox.sendKeys(Keys.ENTER);
		
		 String actualTitle = driver.getTitle();
		 
		 System.out.println("Page Title: " + actualTitle);
		
		  Assertions.assertTrue(
				actualTitle.toLowerCase().contains("Selenium"),
				 "Test Failed: Search keyword not found!"
				
				);
		  
		  System.out.println("Test Passed: Search is successful!");
	}

}
