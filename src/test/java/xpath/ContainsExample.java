package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://example.com/login");
		
		WebElement username = driver.findElement(
				By.xpath("//input[contains(@id, 'user')")
				
				);
				
		
	
	}

}
