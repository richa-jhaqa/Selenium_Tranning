package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBoxValidation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		
		if(searchbox.isEnabled()) {
			System.out.println("searchbox is enable");
		}else {
			System.out.println("searchbox is disable");
		}
		
		if(searchbox.isDisplayed() && searchbox.isEnabled()) {
			System.out.println("Test Passed: Search box validation successful!");
		}
	}

}
