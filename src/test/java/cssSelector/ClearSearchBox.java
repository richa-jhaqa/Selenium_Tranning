package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearSearchBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http//www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		searchbox.sendKeys("Selenium");
		
		searchbox.clear();
		
		searchbox.sendKeys("Java");
		
		searchbox.sendKeys(Keys.ENTER);
		
		String actualTitle = driver.getTitle();
		
		System.out.println("Page Title: " + actualTitle);
		
		if(actualTitle.contains("java")) {
			System.out.println("Test Passed: Java is present in page title");
		}else {
			System.out.println("Test Failed: Java is not present in page titlel");
		}
	}

}
